package com.zzh.consumer.controller;



import com.alibaba.dubbo.config.annotation.Reference;
import com.zzh.provider.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Reference
    UserService service;

    @RequestMapping("/hello")
    public String hello(){
        return service.getName();
    }
}
