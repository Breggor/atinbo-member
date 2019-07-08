package com.atinbo.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;


@SpringBootApplication
@EnableTransactionManagement
public class Starter {

    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
