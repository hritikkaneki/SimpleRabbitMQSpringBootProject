package com.example.rabbitmqdemo.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class User {
 private String name;
 private String address;
 private String email;
}
