// You belong everywhere you are.

// No need to say 'I can do it.' You ARE doing it!

// Life is psychologically difficult for everybody.

// Our bodies and minds are capable of far more than our psyche will let us achieve.

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
