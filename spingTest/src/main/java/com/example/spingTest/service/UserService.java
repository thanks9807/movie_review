package com.example.spingTest.service;

import com.example.spingTest.model.UserLoginDto;
import com.example.spingTest.model.UserRegisterDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean login(UserLoginDto userLoginDto){
        if(userLoginDto.getId().equals("kty") && userLoginDto.getPw().equals("qwer1234")){
            return true;
        }else return false;
    }

    public boolean register(UserRegisterDto userRegisterDto){
        if(userRegisterDto.getId().equals("kty") && userRegisterDto.getPw().equals("qwer1234")){
            return false;
        }else return true;
    }
}
