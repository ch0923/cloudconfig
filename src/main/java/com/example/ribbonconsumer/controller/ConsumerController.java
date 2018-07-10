package com.example.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController {
    /*@Autowired
    private RestTemplate restTemplate;
    */
    @Autowired
    private HelloService helloService;
    @RequestMapping("/ribbon-consumer")
    public String helloConsumer(){
       return helloService.helloservice();
        // return restTemplate.getForEntity("http://HELLO-SERVICE",String.class).getBody();
    }
}
