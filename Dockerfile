#FROM openjdk:17-jdk-alpine
#
#COPY target/ActividadM6-0.0.1-SNAPSHOT.jar java_app.jar
#
#ENTRYPOINT [ "java", "-jar" , "java_app.jar"]
#
# Imagen base con Java y Maven
FROM maven:3.8.1-openjdk-17 AS build

# Establece el directorio de trabajo
WORKDIR /home/app

# Copia los archivos del proyecto al contenedor
COPY src /home/app/src
COPY pom.xml /home/app/pom.xml

# Empaqueta la aplicación usando Maven
RUN mvn install

# Imagen base para la aplicación Spring Boot
FROM openjdk:17-jdk-alpine

# Establece el directorio de trabajo
WORKDIR /app

# Copia el artefacto JAR construido desde la etapa de construcción anterior
COPY --from=build /home/app/target/*.jar /app/app.jar

# Expone el puerto en el que se ejecuta la aplicación Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
CMD ["java", "-jar", "app.jar"]