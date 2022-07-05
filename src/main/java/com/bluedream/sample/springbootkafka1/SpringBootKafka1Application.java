package com.bluedream.sample.springbootkafka1;

import com.bluedream.sample.springbootkafka1.entity.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringBootKafka1Application {

	@Value("${MyApp.topic-name.topic1}")
	private String topicName1;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafka1Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, Message> kafkaTemplate) {
		return args -> {
			// kafkaTemplate.send("amigoscode", new Message("Hello From Kafka", LocalDateTime.now()));
			/*
			for (int i=0; i<=10_000_000; i++) {
				kafkaTemplate.send(topicName1, "Hello world from Kafka1Application - count time:" +i);
			}
			 */
			// kafkaTemplate.send(topicName1, "Hello world for Listener ");

			// for Message entity
			// kafkaTemplate.send(topicName1, new Message("Hello world for Listener ",  LocalDateTime.now()) );

			for (int i=0; i<=10_000; i++) {
				kafkaTemplate.send(topicName1, new Message("Hello world for Listener - count time:" + i,  LocalDateTime.now()) );
			}

		};
	}

}
