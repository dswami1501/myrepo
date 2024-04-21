package com.kafka.kafkaproducer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    //This KafkaListener annotation is used to tell the application from which topic you wanted to listen the messages
    //Note: Groupid is mandatory without it you will get the error ,here for example (groupId = "swami-consumer-groupid")
    @KafkaListener(topics = "swamirecent1", groupId = "swami-group1")
    //here the parameter type(String message) is same as the Producer sending it
    public void consume1(String message){
        log.info("Consumer1 consume the message {} ",message);
    }

    @KafkaListener(topics = "swamirecent1", groupId = "swami-group1")
    //here the parameter type(String message) is same as the Producer sending it
    public void consume2(String message){
        log.info("Consumer2 consume the message {} ",message);
    }

    @KafkaListener(topics = "swamirecent1", groupId = "swami-group1")
    //here the parameter type(String message) is same as the Producer sending it
    public void consume3(String message){
        log.info("Consumer3 consume the message {} ",message);
    }

    @KafkaListener(topics = "swamirecent1", groupId = "swami-group1")
    //here the parameter type(String message) is same as the Producer sending it
    public void consume4(String message){
        log.info("Consumer4 consume the message {} ",message);
    }
}
