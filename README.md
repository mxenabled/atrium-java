# Atrium-Java

A Java wrapper for the [MX Atrium API](https://atrium.mx.com). In order to make requests, you will need to [sign up for the MX Atrium API](https://atrium.mx.com/developers/sign_up) and get a `MX-API-KEY` and a  `MX-CLIENT-ID`.

### Usage

Add the `/com.mx.atrium` directory to your source code's directory. Then configure your instance with the following. (The `ENVIRONMENT` will be either `https://vestibule.mx.com` for the development environment or `https://atrium.mx.com` for the production environment.)
```java
AtriumClient atriumClient = new AtriumClient("ENVIRONMENT", "YOUR_MX_API_KEY", "YOUR_MX_CLIENT_ID");
```

Then start using class methods to make calls to the Atrium API for data. See the full [Atrium documentation](https://atrium.mx.com/documentation) for more details.

```java
public class Main {
  public static void main(String[] args) {

    // Configure AtriumClient
    AtriumClient atriumClient = new AtriumClient("ENVIRONMENT", "YOUR_MX_API_KEY", "YOUR_MX_CLIENT_ID");

    // Now begin making Atrium calls
    atriumClient.createUser("UniqueID", "", ""); // Create a user, etc...

  }
}
```

### Examples

The `/examples` directory contains various workflows and code snippets. You will first need to modify the line shown below in each example with the environment, YOUR-MX-API-KEY, and YOUR-MX-CLIENT-ID before running.
```java
AtriumClient atriumClient = new AtriumClient("ENVIRONMENT", "YOUR_MX_API_KEY", "YOUR_MX_CLIENT_ID");
```

Using Maven, you can quickly build all the examples into executable .jar files by running from the command line
```bash
mvn package
```
The executable .jar files will be outputted in the `/target` directory.
