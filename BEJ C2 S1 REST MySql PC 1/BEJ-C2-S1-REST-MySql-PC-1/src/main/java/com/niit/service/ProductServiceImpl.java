package com.niit.service;

import com.niit.domain.Product;
import com.niit.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService  {


        ProductRepository productRepository;

        @Autowired
        public ProductServiceImpl(ProductRepository productRepository) {
            this.productRepository = productRepository;
        }

    @Override
    public Product addProduct(Product product) {

            if(productRepository.findById(product.getProductId()).isEmpty()){
//                return productRepository.save(product);
                return (Product) productRepository.save(product);
            }
            return null;
//        return productRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
//        return productRepository.findAll();
    }

    @Override
    public String deleteProductById(int productId) {
            if(productRepository.findById(productId).isEmpty()){
                return  "user does not exist";
            }
        productRepository.deleteById(productId);
            return "User deleted successfully";
        }

    @Override
    public List<Product> getProductByProductId(int productId) {
//            return (Product) productRepository.findById(productId);
        return  productRepository.findByProductId(productId);
    }

    }
