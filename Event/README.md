# Event DropWizard Tutorial

Tutorial used:
1. https://www.sitepoint.com/tutorial-getting-started-dropwizard/
1. https://www.sitepoint.com/tutorial-getting-started-dropwizard-crud/

How to start the name application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/Event-0.0.1.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`

How to create new project
---
Run ```mvn archetype:generate \
               -DarchetypeGroupId=io.dropwizard.archetypes \
               -DarchetypeArtifactId=java-simple \
               -DarchetypeVersion=1.3.5```
1.3.5 is the latest version as of writing this.

Structure
---
api: Houses models <br/>
core: db access classes <br/>
resource: defining routes
