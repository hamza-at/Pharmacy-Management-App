package com.aitmansour.pharmacymanagementsystem.controllers;
import com.aitmansour.pharmacymanagementsystem.model.request.ProductDetailsRequest;
import com.aitmansour.pharmacymanagementsystem.model.response.OperationStatusModel;
import com.aitmansour.pharmacymanagementsystem.model.response.ProductDetailsResponse;
import com.aitmansour.pharmacymanagementsystem.model.response.RequestOperationStatus;
import com.aitmansour.pharmacymanagementsystem.service.ProductService;
import com.aitmansour.pharmacymanagementsystem.shared.ProductDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/products/{id}")
    public ProductDetailsResponse getFood(@PathVariable String id) {

    ProductDetailsResponse returnValue = new ProductDetailsResponse();
        ModelMapper modelMapper = new ModelMapper();

        ProductDto productDto = productService.getProductById(id);
        returnValue = modelMapper.map(productDto, ProductDetailsResponse.class);

        return returnValue;
    }
    @PostMapping("/products/addProduct")
    public ProductDetailsResponse createProduct(@RequestBody ProductDetailsRequest productDetails) {
        ProductDetailsResponse returnValue = new ProductDetailsResponse();
        ModelMapper modelMapper = new ModelMapper();
        ProductDto productDto=modelMapper.map(productDetails, ProductDto.class);

        ProductDto createProduct = productService.createProduct(productDto);
        returnValue=modelMapper.map(createProduct,ProductDetailsResponse.class);

        return returnValue;
    }
    @PutMapping("/products/{id}")
    public ProductDetailsResponse updateProduct(@RequestBody ProductDetailsRequest productDetails, @PathVariable String id) {
        ProductDetailsResponse returnValue = new ProductDetailsResponse();

        ModelMapper modelMapper = new ModelMapper();
        ProductDto productDto=modelMapper.map(productDetails, ProductDto.class);

        ProductDto updateProduct = productService.updateProductDetails(id,productDto);
        returnValue=modelMapper.map(updateProduct,ProductDetailsResponse.class);

        return returnValue;
    }

   @DeleteMapping("/products/{id}")
    public OperationStatusModel deleteProduct(@PathVariable String id) {
       OperationStatusModel returnValue = new OperationStatusModel();
       Boolean isRemoved = productService.deleteProduct(id);

       if (Boolean.FALSE.equals(isRemoved)) {
          returnValue.setOperationResult(RequestOperationStatus.ERROR.name());
          return returnValue;
       }

       returnValue.setOperationResult(RequestOperationStatus.SUCCESS.name());
       return returnValue;
   }
   @GetMapping("/products/all")
   public List<ProductDetailsResponse> getProducts() {

       List<ProductDetailsResponse> returnValue = new ArrayList<>();

       List<ProductDto> products = productService.getAllProduct();

       for (ProductDto productDto : products) {
           ProductDetailsResponse response = new ProductDetailsResponse();
           BeanUtils.copyProperties(productDto, response);
           returnValue.add(response);
       }

       return returnValue;
   }
}
