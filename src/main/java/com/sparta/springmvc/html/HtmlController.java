package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html"; // -> Thymeleaf때문에 접근 불가능 -> http://localhost:8080/hello.html 이런식으로 직접 접근 해야함. -> 데이터 바꿀 부분이 없기 때문에 Controller를 거칠 의미가 없음.
    }

    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html"; // -> redirect 방식으로 호출
    }

    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }
}
