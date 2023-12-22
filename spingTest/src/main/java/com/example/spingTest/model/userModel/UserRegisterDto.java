package com.example.spingTest.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserRegisterDto {
    private Integer id;
    private String email;
    private String pw;
}
