package com.example.work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkApplication {

    public static void main(String[] args) {
        String s = "ssdsd";
        int d = s.lastIndexOf("d");
        String substring = s.substring(0, d);
        System.out.println(substring);
        SpringApplication.run(WorkApplication.class, args);
    }

}
