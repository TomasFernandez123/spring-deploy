## Despligue de app Spring Boot render

Crear el archivo `system.properties` en el proyecto con la version de java utilizada

```
java.runtime.version=17
```

1. Crear cuenta en render.com y github.com
2. Tener git en el ordenador
3. Agregar el archivo Dockerfile en el proyecto
   ```
    # Etapa 1: construir el .jar
    FROM maven:3.9.5-eclipse-temurin-17 AS build
    WORKDIR /app
    COPY . .
    RUN mvn clean package -DskipTests
    
    # Etapa 2: imagen final con solo el .jar
    FROM eclipse-temurin:17-jdk-alpine
    WORKDIR /app
    COPY --from=build /app/target/*.jar app.jar
    EXPOSE 8080
    ENTRYPOINT ["java", "-jar", "app.jar"]
   ```
4. Subir el proyecto github desde IntelliJ IDEA desde VCS > Share project on Github 
5. Desde render buscar nuestro repositorio de Github
6. Configurar todo sobre la opcion Docker 
7. Ejecutar el deploy