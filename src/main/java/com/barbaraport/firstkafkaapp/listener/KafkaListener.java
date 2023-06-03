package com.barbaraport.firstkafkaapp.listener;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "MyTopic", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listened: " + data + " :)");
    }
}
