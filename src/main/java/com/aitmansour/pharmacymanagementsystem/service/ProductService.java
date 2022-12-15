package com.aitmansour.pharmacymanagementsystem.service;

import com.aitmansour.pharmacymanagementsystem.io.entity.Product;
import com.aitmansour.pharmacymanagementsystem.shared.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductDto createProduct(ProductDto product);
    ProductDto getProductById(String productId);
    ProductDto updateProductDetails(String productId, ProductDto product);
    Boolean deleteProduct(String productId);
    List<ProductDto> getAllProduct();
}

