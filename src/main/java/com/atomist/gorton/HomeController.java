package com.atomist.gorton;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/foo")
    public String home() {
        return "Hello REST Microservice World";
    }
    
    @RequestMapping(path = "/foo2")
    public String home2() {
        return "Hello REST Microservice World";
    }
    
}
