package com.barbaraport.firstkafkaapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class FirstKafkaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstKafkaAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
			for (int i = 0; i < 1000; i++) {
				kafkaTemplate.send("MyTopic", "Hello, Kafka! Number " + i);
			}
        };
    }
}
