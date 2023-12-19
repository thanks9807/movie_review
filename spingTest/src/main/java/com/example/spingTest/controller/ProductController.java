package com.example.spingTest.controller;

import com.example.spingTest.model.ProductDto;
import com.example.spingTest.model.UserLoginDto;
import com.example.spingTest.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET,value = "/product")
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //조회
    @RequestMapping(method = RequestMethod.POST,value = "/select")
    public ResponseEntity<Object> select(ProductDto productDto){
        //쿼리로 ID,PW전달 받고
        //System.out.println("id:"+productDto.getId()+ ", pw: "+ productDto.getPw());
        //UserService userService = new UserService();
        if(!productService.select().isEmpty())
            return ResponseEntity.ok().body(productService.select());
        else{
            return ResponseEntity.badRequest().body(productService.select());
        }
    }

    @RequestMapping(method = RequestMethod.POST,value = "/insert")
    public ResponseEntity<Object> insert(ProductDto productDto){
        //쿼리로 ID,PW전달 받고
        //System.out.println("id:"+productDto.getId()+ ", pw: "+ productDto.getPw());
        //UserService userService = new UserService();
        if(productService.insert(productDto))
            return ResponseEntity.ok().body(productService.insert(productDto));
        else{
            return ResponseEntity.badRequest().body(productService.insert(productDto));
        }
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    public ResponseEntity<Object> delete(ProductDto productDto){
        //쿼리로 ID,PW전달 받고
        //System.out.println("id:"+productDto.getId()+ ", pw: "+ productDto.getPw());
        //UserService userService = new UserService();
        if(productService.insert(productDto))
            return ResponseEntity.ok().body(productService.insert(productDto));
        else{
            return ResponseEntity.badRequest().body(productService.insert(productDto));
        }
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    public ResponseEntity<Object> update(ProductDto productDto){
        //쿼리로 ID,PW전달 받고
        //System.out.println("id:"+productDto.getId()+ ", pw: "+ productDto.getPw());
        //UserService userService = new UserService();
        if(productService.insert(productDto))
            return ResponseEntity.ok().body(productService.insert(productDto));
        else{
            return ResponseEntity.badRequest().body(productService.insert(productDto));
        }
    }
}
