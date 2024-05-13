package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("hello")
    @ResponseBody
    // Templates에 있는 HTML파일을 실행하는 것이 아닌 값을 전달.
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "GET Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE Method 요청";
    }
}
