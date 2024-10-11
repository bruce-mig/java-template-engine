# JTE with Spring Boot

This repository contains multiple projects using JTE (Java Template Engine) with Spring Boot. It demonstrates how to set up and use JTE in a Spring Boot application, offering a lightweight and performant alternative to other templating engines like Thymeleaf.

## Why Choose JTE over Thymeleaf?

While Thymeleaf is a popular choice for Spring Boot applications, JTE offers several advantages:

1. **Performance**: JTE compiles templates to Java bytecode, resulting in very efficient runtime execution. This can lead to better performance, especially for high-traffic applications.

2. **Compile-time checking**: JTE performs extensive compile-time checks, catching many errors (like missing parameters or incorrect types) during compilation rather than at runtime. This can significantly improve development productivity and reduce runtime errors.

3. **Simpler syntax**: JTE uses a syntax that's very close to Java, making it easier for Java developers to pick up. As seen in the `index.jte` file, the syntax is intuitive and closely resembles Java code.

4. **Lightweight**: JTE is a more lightweight library compared to Thymeleaf, with fewer dependencies and a smaller footprint.

5. **Better IDE support**: Because JTE compiles to Java, it can leverage existing Java tooling, often resulting in better IDE support, including features like code completion and refactoring.

6. **Hot reloading**: JTE supports hot reloading of templates in development mode without requiring a server restart, which can speed up the development process.

7. **Precompilation**: JTE allows you to precompile templates, which can be useful for detecting errors early and improving startup times in production.

8. **Explicit over implicit**: JTE favors explicit declarations (like `@param` for parameters) over implicit conventions, making templates more self-documenting and easier to understand.
