package com.example.rabbitmqhello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@RabbitListener(queues ="hello") // 监听队列hello
@Component
public class Receiver {
    // 设置消费方法
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }
}