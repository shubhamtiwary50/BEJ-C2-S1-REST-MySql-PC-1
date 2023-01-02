package com.niit.controller;

import com.niit.domain.Product;
import com.niit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProductController {

    ProductService productService;

    @Autowired
    ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping("/addproduct")
//    question mark ? is a wild card character
    public ResponseEntity<?> addProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/getallproduct")
    public ResponseEntity<?> getAllProduct(){
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable int productId){
        return new ResponseEntity<>(productService.deleteProductById(productId), HttpStatus.OK);
    }


    @GetMapping("searchproduct/{productId}")
    public ResponseEntity<?> fetchByProductId(@PathVariable int productId){
        return new ResponseEntity<>(productService.getProductByProductId(productId),HttpStatus.FOUND);
    }

}
