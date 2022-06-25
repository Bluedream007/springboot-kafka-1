package com.bluedream.sample.springbootkafka1.controller;

import com.bluedream.sample.springbootkafka1.entity.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

    private final KafkaTemplate<String, Message> kafkaTemplate;

    @Value("${MyApp.topic-name.topic1}")
    private String topicName1;


    public MessageController(KafkaTemplate<String, Message> kafkaTemplate) {

        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void publish(@RequestBody MessageRequest request) {
        Message message = new Message(request.message(), LocalDateTime.now());
        //String message = request;

        System.out.println("message: " + message);

        kafkaTemplate.send(topicName1, message);
    }
}
