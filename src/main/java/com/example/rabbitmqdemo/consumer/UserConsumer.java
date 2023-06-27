package com.example.rabbitmqdemo.consumer;

import com.example.rabbitmqdemo.config.MessagingConfig;
import com.example.rabbitmqdemo.dto.UserStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {
    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(UserStatus userStatus){
        System.out.println("Message received from Queue: "+userStatus);
    }
}
