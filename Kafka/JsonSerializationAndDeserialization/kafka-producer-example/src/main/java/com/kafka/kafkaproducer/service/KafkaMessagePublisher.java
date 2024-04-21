package com.kafka.kafkaproducer.service;

import com.kafka.kafkaproducer.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {
    @Autowired
    private KafkaTemplate<String, Object> template;

    public void sendMessageToTopic(String message){
        CompletableFuture<SendResult<String, Object>> sendingMessages = template.send("swamirecent1", message);
        sendingMessages.whenComplete((result, ex) -> {
           if(ex == null){
               System.out.println("Sent message=["+message+"] with offset=["+result.getRecordMetadata().offset()+"]");
           } else {
               System.out.println("Unable to send message=["+message+"] due to: "+ex.getMessage());
           }
        });
    }

    public void sentEventsToTopic(Customer customer){
        try{
            CompletableFuture<SendResult<String, Object>> sendingMessages = template.send("demo", customer);
            sendingMessages.whenComplete((result, ex) -> {
                if(ex == null){
                    System.out.println("Sent message=["+customer.toString()+"] with offset=["+result.getRecordMetadata().offset()+"]");
                } else {
                    System.out.println("Unable to send message=["+customer.toString()+"] due to: "+ex.getMessage());
                }
            });
        }catch (Exception ex){
            System.out.println("Error : "+ex.getMessage());
        }
    }
}
