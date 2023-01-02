package com.niit.repository;

import com.niit.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

//    public List<Product> findByProductId(int productId);
public List<Product> findByProductId(int productId);


}
