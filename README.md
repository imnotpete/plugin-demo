# plugin-demo

Just a quick demonstration of a basic plugin architecture using Spring Boot.

demo-core defines a service interface DemoService.

demo-application uses Spring to autowire any DemoService implementations with @Component on the classpath in the com.example.demo package. It also uses loader.properties to specify a relative folder path (plugins/) to look for jars to add to the classpath.

demo-plugin provides an @Component implementation of DemoService, loaded at runtime if the demo-plugin jar is in the plugins folder.

# building

1. Run `mvn clean install` in the project root. 
1. Copy `demo-application-<version>.jar` to a folder. 
1. Make a subfolder `plugins/`.
1. Copy `demo-plugin-<version>.jar` to that folder.
1. Run `java -jar demo-application-<version>.jar`
