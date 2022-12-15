package com.aitmansour.pharmacymanagementsystem.service.impl;



import com.aitmansour.pharmacymanagementsystem.io.entity.Product;
import com.aitmansour.pharmacymanagementsystem.io.repos.ProductRepository;
import com.aitmansour.pharmacymanagementsystem.model.utils.Shared;
import com.aitmansour.pharmacymanagementsystem.service.ProductService;
import com.aitmansour.pharmacymanagementsystem.shared.ProductDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;


public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    private Shared shared=new Shared();

    public ProductServiceImpl(ProductRepository productRepository){

        this.productRepository=productRepository;
    }
    @Override
    public ProductDto createProduct(ProductDto product) {

        ModelMapper modelMapper = new ModelMapper();
        Product productEntity = modelMapper.map(product, Product.class);


        String publicProductId = shared.generateFoodId(30);
        productEntity.setProductId(publicProductId);

        //Saving the product to the database -> products

        Product storedProduct = productRepository.save(productEntity);

        ProductDto productDto = new ProductDto();
        productDto = modelMapper.map(storedProduct, ProductDto.class);
    return productDto;
    }

    @Override
    public ProductDto getProductById(String productId) {
        ProductDto returnValue = new ProductDto();
        ModelMapper modelMapper = new ModelMapper();

        Product productEntity = productRepository.findByProductId(productId);

        if (productEntity == null) {


           // throw new UsernameNotFoundException(productId);
        }

        returnValue = modelMapper.map(productEntity, ProductDto.class);

        return returnValue;
    }

    @Override
    public ProductDto updateProductDetails(String productId, ProductDto productInput) {

        ProductDto returnValue = new ProductDto();
        ModelMapper modelMapper = new ModelMapper();

        Product productEntity = productRepository.findByProductId(productId);

        if (productEntity == null) {


            //throw new UsernameNotFoundException(productId);
        }

        productEntity.setName(productInput.getName());
        productEntity.setCategory(productInput.getCategory());
        productEntity.setOrder(productInput.getOrder());
        productEntity.setEffets(productInput.getEffets());
        productEntity.setExpirationDate(productInput.getExpirationdate());
        productEntity.setPurchasePrice(productInput.getPurchasePrice());
        productEntity.setSellingPrice(productInput.getSellingPrice());
        productEntity.setQuantity(productInput.getQuantity());
        productEntity.setRegistrationDate(productInput.getRegistrationdate());
        productEntity.setStock(productInput.getStock());
        productEntity.setSuppliers(productInput.getSuppliers());
        productEntity.setStoreBox(productInput.getStoreBox());

        Product updatedProductEntity = productRepository.save(productEntity);
        returnValue = modelMapper.map(updatedProductEntity, ProductDto.class);


        return returnValue;
    }



    @Override
    public Boolean deleteProduct(String productId) {

        Product productEntity = productRepository.findByProductId(productId);

        if (productEntity == null) {


            //throw new UsernameNotFoundException(id);
            //
        }


        return productRepository.deleteProductById(productEntity.getProductId());

    }

    @Override
    public List<ProductDto> getAllProduct() {

        List<ProductDto> returnValue = new ArrayList<>();
        Iterable<Product> iterableObjects = productRepository.findAll();

        for (Product productEntity : iterableObjects) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productEntity, productDto);
            returnValue.add(productDto);
        }


        return returnValue;
    }
}
