FROM java:8
WORKDIR /blog-backend
ADD blog-springboot-0.0.1.jar blog-backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "blog-backend.jar"]