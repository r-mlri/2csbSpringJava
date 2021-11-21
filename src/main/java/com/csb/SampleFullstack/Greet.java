package com.csb.SampleFullstack;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/greet")
@CrossOrigin("*")
public class Greet {
    
    @RequestMapping("/hello")
    public String hello(){
        
        return "Hello World!";
    }
    @RequestMapping("/hi")
    public String hi(){
        
        return "hi";
    }
}
