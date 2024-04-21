package com.kafka.kafkaproducer.controller;

import com.kafka.kafkaproducer.dto.Customer;
import com.kafka.kafkaproducer.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class EventController {
    @Autowired
    private KafkaMessagePublisher publisher;

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publicMessage(@PathVariable String message){
        try {
            for(int i=0;i<=100000;i++){
                publisher.sendMessageToTopic(message+i);
            }
            return ResponseEntity.ok("message published successfully ..");
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/publish")
    public void sendEvents(@RequestBody Customer customer){
        publisher.sentEventsToTopic(customer);
    }

    @GetMapping("/test")
    public void testing(){
        System.out.println("success");
    }
}
