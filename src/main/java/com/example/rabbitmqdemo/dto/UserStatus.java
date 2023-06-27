package com.example.rabbitmqdemo.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class UserStatus {
    private User user;
    private String status;
    private String message;


}
