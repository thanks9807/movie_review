package com.example.spingTest.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class UserDto {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String authority;
    List<OrderDto> orderDtoList = new ArrayList<>();
}
