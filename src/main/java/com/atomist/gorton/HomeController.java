// Make new mistakes as fast as you can.

// Finite games are played within boundaries. Infinite games play with boundaries.

// Life is psychologically difficult for everybody.

// Finite games are played within boundaries. Infinite games play with boundaries.

// It’s only a thought, and a thought can be changed.

// I believe in you. You can do the thing!

// Life is its own reason for being. It is beautiful to have a sense of beauty.

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
