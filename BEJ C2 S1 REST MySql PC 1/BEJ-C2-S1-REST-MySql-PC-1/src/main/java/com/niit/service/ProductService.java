package com.niit.service;

import com.niit.domain.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);

    public List<Product> getProducts();

    public String deleteProductById(int productId);

    public List<Product> getProductByProductId(int productId);

}
