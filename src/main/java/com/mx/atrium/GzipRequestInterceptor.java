/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.squareup.okhttp.*;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

import java.io.IOException;

/**
 * Encodes request bodies using gzip.
 *
 * Taken from https://github.com/square/okhttp/issues/350
 */
class GzipRequestInterceptor implements Interceptor {
    @Override public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        if (originalRequest.body() == null || originalRequest.header("Content-Encoding") != null) {
            return chain.proceed(originalRequest);
        }

        Request compressedRequest = originalRequest.newBuilder()
                                                   .header("Content-Encoding", "gzip")
                                                   .method(originalRequest.method(), forceContentLength(gzip(originalRequest.body())))
                                                   .build();
        return chain.proceed(compressedRequest);
    }

    private RequestBody forceContentLength(final RequestBody requestBody) throws IOException {
        final Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return new RequestBody() {
            @Override
            public MediaType contentType() {
                return requestBody.contentType();
            }

            @Override
            public long contentLength() {
                return buffer.size();
            }

            @Override
            public void writeTo(BufferedSink sink) throws IOException {
                sink.write(buffer.snapshot());
            }
        };
    }

    private RequestBody gzip(final RequestBody body) {
        return new RequestBody() {
            @Override public MediaType contentType() {
                return body.contentType();
            }

            @Override public long contentLength() {
                return -1; // We don't know the compressed length in advance!
            }

            @Override public void writeTo(BufferedSink sink) throws IOException {
                BufferedSink gzipSink = Okio.buffer(new GzipSink(sink));
                body.writeTo(gzipSink);
                gzipSink.close();
            }
        };
    }
}