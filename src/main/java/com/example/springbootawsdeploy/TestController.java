package com.example.springbootawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "Congrats Anthony for launching the app on AWS ECS";
    }
@GetMapping("/message")
    public String getmessage() {
        return "Congrats Anthony for testing the CICD pipeline";
    }
   
}
