package com.example.rabbitmqdemo.publisher;

import com.example.rabbitmqdemo.config.MessagingConfig;
import com.example.rabbitmqdemo.dto.User;
import com.example.rabbitmqdemo.dto.UserStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPublisher {
    private final RabbitTemplate rabbitTemplate;

    public UserPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
    @PostMapping("/setUser")
    public String userData(@RequestBody User user){
        UserStatus userStatus = new UserStatus(user, "Processing", "User Processed");
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE,MessagingConfig.ROUTING_KEY,userStatus);
        return "Success";

    }
}
