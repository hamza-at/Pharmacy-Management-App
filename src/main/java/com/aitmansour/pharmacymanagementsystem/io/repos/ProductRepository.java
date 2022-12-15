package com.aitmansour.pharmacymanagementsystem.io.repos;

import com.aitmansour.pharmacymanagementsystem.io.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,String> {
    Product findByProductId(String ProductId);
    Boolean deleteProductById(String ProductId);
    List<Product> findAllProduct();

}
