package com.LeahGrace.demo.DemoServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demoMessage")
    public String renderMessage(){
        return "Are You Happy Now Margarite?!";
    }

}
