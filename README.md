# Springboot Kafka Producer

[Apache Kafka](https://kafka.apache.org/) is an open-source distributed event streaming platform for high-performance
data pipelines, streaming analytics, data integration, and mission-critical applications.

![kafka producer service](https://github.com/arsibux/kafka-producer-microservice/blob/main/draw_io/kafka-producer.drawio.png "kafka producer service")

## Installation

1. Run command at code directory `git clone https://github.com/arsibux/springboot-kafka-producer.git`
2. Run `docker-compose up -d` [docker-desktop installaton](https://docs.docker.com/desktop/)
3. Open Project in [IntelliJ Idea](https://www.jetbrains.com/idea/download/).
4. Run `mvn clean install` and run `mvn spring-boot:run`
5. Import workspace file of [Postman](https://www.postman.com/downloads/)
   at `${root}/postman/kafka-producer.postman_collection` into postman.

![postman-api-call](https://github.com/arsibux/kafka-producer-microservice/blob/main/docs/img/postman-api-call.png "postman-api-call")

6. Run in
   terminal `docker exec --interactive --tty kafka kafka-console-consumer --bootstrap-server localhost:9092 --topic MESSAGE-TOPIC --from-beginning`

You can the message here at terminal.

![postman-api-call](https://github.com/arsibux/kafka-producer-microservice/blob/main/docs/img/verify.png "postman-api-call")

