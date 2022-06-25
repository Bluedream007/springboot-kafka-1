package com.bluedream.sample.springbootkafka1.service;

import com.bluedream.sample.springbootkafka1.entity.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @Value("${MyApp.topic-name.topic1}")
    private String topicName1;


    //@KafkaListener(topics = "NewTopic1", groupId = "groupId", containerGroup = "mesgKafkaListenerContainerFactory")
    @KafkaListener(topics = "NewTopic1", groupId = "group-01", containerFactory = "mesgKafkaListenerContainerFactory")
    void listener(Message data) {

        System.out.println("Listener received: " + data + " ");
    }

}
