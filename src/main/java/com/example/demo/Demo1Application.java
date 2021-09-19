package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@RestController

public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }


    @RequestMapping("/test")
    public String test() {
        return "1, hello world2 2!" + new SimpleDateFormat("[yyyy-mm-dd HH:mm:ss]").format(new Date());

    }
}
