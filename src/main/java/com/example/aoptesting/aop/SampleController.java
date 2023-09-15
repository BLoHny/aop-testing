package com.example.aoptesting.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private Target target;

    @GetMapping("/")
    public void test() {
        target.doSomething();
    }
}
