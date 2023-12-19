package com.example.spingTest.controller;

import com.example.spingTest.model.UserLoginDto;
import com.example.spingTest.model.UserRegisterDto;
import com.example.spingTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;// 나쁜 코드
    @RequestMapping(method = RequestMethod.POST,value = "/login")
    public ResponseEntity<Object> login(UserLoginDto userLoginDto){
        //쿼리로 ID,PW전달 받고
        System.out.println("id:"+userLoginDto.getId()+ ", pw: "+ userLoginDto.getPw());
        //UserService userService = new UserService();
        if(userService.login(userLoginDto))
            return ResponseEntity.ok().body(userService.login(userLoginDto));
        else{
            return ResponseEntity.badRequest().body(userService.login(userLoginDto));
        }
    }
    @RequestMapping(method = RequestMethod.GET,value = "/login")
    public String login(){

        return "/userFeat/login";
    }

    @RequestMapping("register")
    public ResponseEntity<Object> signin(UserRegisterDto userRegisterDto){
        System.out.println("id:"+userRegisterDto.getId()+ ", pw: "+ userRegisterDto.getPw());
        System.out.println(userRegisterDto.getEmail());

        if(userService.register(userRegisterDto))
            return ResponseEntity.ok().body(userService.register(userRegisterDto));
        else
            return ResponseEntity.badRequest().body(userService.register(userRegisterDto));

    }
}
