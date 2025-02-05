package com.JumpToSpringBoots.JumpToSpringBoots.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list"; //redirect : question/list로 페이지를 리다이렉트하라는 명령어
    }
}
