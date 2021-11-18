package com.qyc.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Description TODO
 * @Author qianyongchao
 * @CreateTime 2021-11-18 22:59:00
 */
@RestController
public class TestController {





    @GetMapping("test")
    public String test() {
        System.out.println("hello world");
        return "hello world";
    }
}
