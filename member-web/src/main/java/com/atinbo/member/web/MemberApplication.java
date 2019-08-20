package com.atinbo.member.web;

import com.atinbo.dislock.annotation.EnableDisLock;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@EnableDubbo
@EnableDisLock
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
