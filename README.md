# Atrium-Java

A Java wrapper for the [MX Atrium API](https://atrium.mx.com). In order to make requests, you will need to [sign up for the MX Atrium API](https://atrium.mx.com/developers/sign_up) and get a `MX-API-KEY` and a  `MX-CLIENT-ID`.

### Usage

Add the `AtriumClient.java` file to your source code's directory. Then configure your instance with the following. (The `ENVIRONMENT` will be either `https://vestibule.mx.com` for the development environment or `https://atrium.mx.com` for the production environment.)
```java
AtriumClient atriumClient = new AtriumClient(ENVIRONMENT, YOUR_MX_API_KEY, YOUR_MX_CLIENT_ID);
```

Then start using class methods to make calls to the Atrium API for data. See the full [Atrium documentation](https://atrium.mx.com/documentation) for more details.

```java
public class Main {
  public static void main(String[] args) {

    // Configure AtriumClient
    AtriumClient atriumClient = new AtriumClient(ENVIRONMENT, YOUR_MX_API_KEY, YOUR_MX_CLIENT_ID);

    // Now begin making Atrium calls
    atriumClient.createUser("UniqueID", "", ""); // Create a user, etc...

  }
}
```


### Suggested Atrium Workflow

In the `/examples` directory is a suggested Atrium workflow in a simple command line program.

Navigate to the `/examples` directory. This directory contains the following files:

* ExampleWorkflow.java - An example showing a suggested workflow for Atrium
* AtriumClient.java - Wrapper library for Atrium
* JSON-java.jar - Library to easily parse JSON ([source](https://github.com/stleary/JSON-java))

##### Compile source code with .jar file included in classpath
`$ javac -cp ".:JSON-java.jar:" ExampleWorkflow.java`

##### Run example workflow program with .jar file included in classpath

`$ java -cp ".:JSON-java.jar:" ExampleWorkflow ENVIRONMENT YOUR_MX_API_KEY YOUR_MX_CLIENT_ID`

*Please note, Windows users will need to replace : with ;
