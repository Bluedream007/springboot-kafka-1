# Read Me First
  This is a project for Kafka test:
* Send & Receive from topic


# Getting Started

### Reference Documentation
* Github sourec code - https://github.com/webmak1/Kafka-Tutorial
* YouTube - https://www.youtube.com/watch?v=SqVfCyfCJqw
* [APACHE KAFKA QUICKSTART](https://kafka.apache.org/quickstart)
*[Spring for Apache Kafka](https://spring.io/projects/spring-kafka#overview)

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Run
* Kafka command - 
  read: /home/charlotte-lp/Charlotte/Comand_Script/Docker_CmdLine.txt
    
- Install & Start the application using Docker Compose
  ./docker-compose
> docker-compose -f cp-Kafka_docker-compose.yml up -d
- stop  
> docker-compose -f cp-Kafka_docker-compose.yml down

- Run consumer; Read messages from the topic     
> docker exec --interactive --tty broker \
kafka-console-consumer --bootstrap-server broker:9092 \
--topic NewTopic1 \
--from-beginning

- Run producer; Send messages from the topic
> docker exec --interactive --tty broker \
kafka-console-producer --bootstrap-server broker:9092 \
--topic NewTopic1

- Run by CLI
> mvn spring-boot:run

# TODO
* Confluent
  - [Spring for Apache Kafka Deep Dive – Part 1: Error Handling, Message Conversion and Transaction Support](https://www.confluent.io/blog/spring-for-apache-kafka-deep-dive-part-1-error-handling-message-conversion-transaction-support/)
  - [Spring for Apache Kafka Deep Dive – Part 2: Apache Kafka and Spring Cloud Stream](https://www.confluent.io/blog/spring-for-apache-kafka-deep-dive-part-2-apache-kafka-spring-cloud-stream/)
* [Concurrency in Spring WebFlux](https://www.baeldung.com/spring-webflux-concurrency)
* [Apache Kafka and API Management with Service Mesh](https://www.confluent.io/events/kafka-summit-apac-2021/apache-kafka-and-api-management-api-gateway-friends-enemies-or-frenemies/)  
* [Java 14 Record Keyword](https://www.baeldung.com/java-record-keyword)


