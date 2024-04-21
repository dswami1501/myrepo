package com.kafka.kafkaproducer.consumer;

import com.kafka.kafkaproducer.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    //This KafkaListener annotation is used to tell the application from which topic you wanted to listen the messages
    //Note: Groupid is mandatory without it you will get the error ,here for example (groupId = "swami-consumer-groupid")
    @KafkaListener(topics = "demo", groupId = "demo-group1")
    //here the parameter type(String message) is same as the Producer sending it
    public void consume(Customer customer){
        log.info("Consumer consume the message {} ",customer.toString());
    }
}
