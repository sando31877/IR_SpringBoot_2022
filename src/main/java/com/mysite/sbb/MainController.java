package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/welcome") // http://도메인/sbb 라는 요청이 들어왔을 때
    @ResponseBody // URL 요청에 대한 응답으로 문자열을 리턴하라는 애너테이션
    public String index() {
        return "Welcome to the Internet!";  // URL 요청시 문자열이 나오는 것을 알 수 있음
    }

    @RequestMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
    
}