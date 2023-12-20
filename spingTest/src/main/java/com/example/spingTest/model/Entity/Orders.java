package com.example.spingTest.model.Entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "User_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "Product_id")
    Product product;

}
