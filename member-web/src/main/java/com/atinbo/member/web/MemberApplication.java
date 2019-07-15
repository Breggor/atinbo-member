package com.atinbo.member.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication(scanBasePackages = "com.atinbo")
public class MemberApplication {


    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
