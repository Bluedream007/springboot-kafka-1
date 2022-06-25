package com.bluedream.sample.springbootkafka1.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @Value("${MyApp.topic-name.topic1}")
    private String topicName1;


    @KafkaListener(topics = "NewTopic1", groupId = "groupId", containerGroup = "messageFactory")
    // void listener(Message data) {
    void listener(String data) {
        System.out.println("Listener received: " + data + " ");
    }

}
