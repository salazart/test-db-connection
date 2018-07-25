# test-db-connection
This project using for testing connection to data base.
If this app may connect to batabase, then app exit with code 0 else 1. 
If you want to use project, you need to build jar file like it:
gradle clean build

and run the jar-file like it:
java -jar build/libs/test-db-connection.jar jdbc:oracle:thin:@localhost:1521:dbname user pass