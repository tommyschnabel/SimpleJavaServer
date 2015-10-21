Simple Java server
==================

So I previously spent hours upon hours setting this up for a school project, and I figured that I would save other people that pain.
Feel free to use this for whatever, I don't care.

Some cool technologies this uses:

* Jersey  - Rest API
* Guice   - Dependency Injection
* Gradle  - Building
* Jetty   - Servlet Container
* Jackson - JSON serialization and deserialization
* Webjars - Serving up web-side libraries

To startup the server with Jetty, just run this from the terminal in the root directory of the project:
`./gradlew jettyRun`
