# Kafka Producer Microservice


[Apache Kafka](https://kafka.apache.org/) is an open-source distributed event streaming platform for high-performance data pipelines, streaming analytics, data integration, and mission-critical applications.

![kafka producer service](https://github.com/arsibux/kafka-producer-microservice/blob/main/kafka-producer.png "kafka producer service")

## Installation

1. Run command at code directory `git clone https://github.com/arsibux/kafka-producer-microservice.git`.
2. Run `docker-compose up -d`  [docker-desktop installaton] (https://docs.docker.com/desktop/).
3. Run `docker exec --interactive --tty kafka kafka-console-consumer --bootstrap-server localhost:9092 --topic MESSAGE-TOPIC --from-beginning`
