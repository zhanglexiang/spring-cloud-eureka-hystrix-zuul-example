package com.laozhang.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/rest/hello/server")
public class HelloResource {

    @Value("${server.port}")
    private int port;

    @GetMapping
    public String hello() throws InterruptedException {
        System.out.println("port: " + port);
        if(port == 8071){
            Thread.sleep(1200);
        }
        return "Hello World!";
    }
}
