# Token, Token Secret, and Raw Response Retriever for Splitwise API
Prints and saves to a .txt file the token, token secret, and raw response for your Splitwise API credentials.

## Prerequisites
- Maven
- Java 11

## Usage
Execution of commands should be done in the same directory as the pom.xml file.
### Build
1. Add your consumer key and consumer secret into line 7 of _src/main/java/Main.java_.
2. `mvn clean`
3. `mvn compile`
4. `mvn package`

### Run
`java -jar target/TokenTokenSecretRawResponseRetriever-1.0-SNAPSHOT.jar`
