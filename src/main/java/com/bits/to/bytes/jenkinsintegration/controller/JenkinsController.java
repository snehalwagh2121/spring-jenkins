package com.bits.to.bytes.jenkinsintegration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class JenkinsController {

    @GetMapping("/hello")
    public String helloResponse(){
        return "Hello There!";
    }
}
