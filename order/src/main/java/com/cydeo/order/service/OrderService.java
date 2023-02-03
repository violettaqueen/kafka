package com.cydeo.order.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @KafkaListener(topics = "order")
    public void consumeMessage(String message){
        System.out.println("Message consumed, order will be created " + message);
    }
}
