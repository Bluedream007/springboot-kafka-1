package com.bluedream.sample.springbootkafka1.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.time.LocalDateTime;

//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record Message(String message, LocalDateTime created) {
}
