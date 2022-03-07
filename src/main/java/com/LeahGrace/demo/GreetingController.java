package com.LeahGrace.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();
    private final static String template = "Hello %s";

    @GetMapping("/")
    public String getHello() {
        return "Hello World";
    }

    @GetMapping("/sayHello")
    public Greeting sayHello() {
        return new Greeting(42, "Hello CD!");
    }

    @GetMapping("/greeting")
    public Greeting Greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    //Dynamic URL's
    @GetMapping("/hello/{name}")
    public Greeting hello(@PathVariable String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

