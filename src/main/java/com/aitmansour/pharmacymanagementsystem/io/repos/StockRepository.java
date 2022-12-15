package com.aitmansour.pharmacymanagementsystem.io.repos;

import com.aitmansour.pharmacymanagementsystem.io.entity.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository {
        Stock findByStockId(String StockId);
    }
