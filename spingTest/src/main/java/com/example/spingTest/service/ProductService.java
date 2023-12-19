package com.example.spingTest.service;

import com.example.spingTest.model.Entity.Product;
import com.example.spingTest.model.ProductDto;
import com.example.spingTest.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product select(Integer id) {
//        if () //엔티티를 디티오로 바꿔주는 코드
//            this.productRepo.findById(id)
        return null;
    }

    public List<Product> select() {
        return this.productRepo.findAll();
    }
    public boolean insert(ProductDto newProductDto){
        //repo에 추가
        //this.productRepo.save();
        return true;
    }
    public boolean delete(Integer id){
        //this.productRepo.delete();
        //repo에서 삭제
        return true;
    }
    public boolean update(ProductDto target){
        //this.productRepo.save();
        //repo에서 변경
        return true;
    }
}
