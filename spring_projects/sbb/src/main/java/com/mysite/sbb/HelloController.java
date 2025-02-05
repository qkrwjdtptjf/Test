package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello") //"/hello"는 url 명, 메서드와 이름 동일할 필요X
    @ResponseBody //포스트 방식 요청
    public String hello(){ //hello는 메서드 명
        return "Hello! Spring Boot Board";
    }
}
