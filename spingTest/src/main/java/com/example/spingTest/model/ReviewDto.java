package com.example.spingTest.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Builder
@Getter
@Setter
public class ReviewDto {
    Integer id;
    Integer star;
    String text;
    MovieDto movieDto;
}
