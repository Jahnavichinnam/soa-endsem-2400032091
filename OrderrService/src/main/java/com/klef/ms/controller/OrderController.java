
package com.klef.ms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/display")
    public String display() {

        System.out.println("Request handled by port: " + port);

        return "Order Service running on port: " + port;
    }
}
