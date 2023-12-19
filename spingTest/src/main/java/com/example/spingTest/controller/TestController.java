package com.example.spingTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Component 어노테이션을 추가해서 스프링을 실행할 때 객체를 생성하게 한다.
@RequestMapping("/kty") //들어온 ID 가 다음과 같으면 TestController 객체를 쓴다.
public class TestController {
    @RequestMapping("/")
    public void defaultMethod(){
        System.out.println("TestController class의 defaultMethod method가 실행되었다.");
    }
    @RequestMapping("/hello")
    public void helloMethod(){
        System.out.println("TestController class의 helloMethod method가 실행되었다.");
    }
}
