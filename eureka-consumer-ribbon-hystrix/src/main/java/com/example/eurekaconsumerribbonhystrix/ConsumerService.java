package com.example.eurekaconsumerribbonhystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    /**
     * rest调用模版
     */
    @Autowired
    RestTemplate restTemplate;

    /**
     * 加上熔断命令，指明回滚方法
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    /**
     * 回滚方法
     * @return
     */
    public String fallback() {
        return "fallback";
    }
}