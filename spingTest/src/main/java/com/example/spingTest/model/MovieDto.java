package com.example.spingTest.model;
import com.example.spingTest.model.Entity.Review;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class MovieDto {
    Integer id;
    String name;
    Integer price;
    private List<Review> reviews = new ArrayList<>();
}
