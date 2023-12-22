package com.example.spingTest.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserLoginReq {
    //private Integer id;
    private String email;
    private String password;


}
