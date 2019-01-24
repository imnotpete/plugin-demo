# plugin-demo

Just a quick demonstration of a basic plugin architecture using Spring Boot.

# building

1. Run `mvn clean install` in the project root. 
1. Copy `demo-application-<version>.jar` to a folder. 
1. Make a subfolder `plugins/`.
1. Copy `demo-plugin-<version>.jar` to that folder.
1. Run `java -jar demo-application-<version>.jar`
