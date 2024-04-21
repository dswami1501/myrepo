package com.kafka.kafkaproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {
    //Function to create topic using code instead creating manually using command prompt
    @Bean
    public NewTopic createTopic(){
        return new NewTopic("swamirecent1",3,(short) 1);
    }
}
