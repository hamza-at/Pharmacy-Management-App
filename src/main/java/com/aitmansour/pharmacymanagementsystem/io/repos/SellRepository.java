package com.aitmansour.pharmacymanagementsystem.io.repos;

import com.aitmansour.pharmacymanagementsystem.io.entity.Sell;
import org.springframework.data.repository.CrudRepository;

public interface SellRepository extends CrudRepository {
    Sell findBySellId(String SellId);
}
