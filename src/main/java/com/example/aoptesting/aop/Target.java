package com.example.aoptesting.aop;

import org.springframework.stereotype.Component;

@Component
public class Target {

    public void doSomething() {
        for (int i = 0; i < 10; i ++) {
            System.out.println("작업 중입니다.");
        }
    }
}
