package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@Controller
@EnableAutoConfiguration
public class App {
    /**
     * @return "Hello World!" string
     */
//    @ResponseBody
//    @RequestMapping("/")
//    String home() {
//        return "Hello World!";
//    }

    /**
     * @return index.html page
     */
    @RequestMapping("/")
    String home() {
        return "index.html";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
