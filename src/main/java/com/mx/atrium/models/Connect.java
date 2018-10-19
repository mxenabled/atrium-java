package com.mx.atrium.models;

public class Connect {
    private String connect_widget_url;
    private String guid;

    public String getConnect_Widget_Url() {
        return connect_widget_url;
    }

    public String getGuid() {
        return guid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Connect{");
        sb.append("connect_widget_url='").append(connect_widget_url).append('\'');
        sb.append(", guid='").append(guid).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Connect connect = (Connect) o;

        if (connect_widget_url != null ? !connect_widget_url.equals(connect.connect_widget_url) : connect.connect_widget_url != null)
            return false;
        return guid != null ? guid.equals(connect.guid) : connect.guid == null;
    }

    @Override
    public int hashCode() {
        int result = connect_widget_url != null ? connect_widget_url.hashCode() : 0;
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        return result;
    }
}
