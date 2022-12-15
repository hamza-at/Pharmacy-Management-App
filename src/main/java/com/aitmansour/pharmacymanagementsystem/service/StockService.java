package com.aitmansour.pharmacymanagementsystem.service;
import com.aitmansour.pharmacymanagementsystem.io.entity.Stock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StockService {


        Stock createStock(Stock stock);
        Stock getStockById(String stockId);
        Stock updateStockDetails(String stockId, Stock stock);
        void deleteStock(String stockId);
        List<Stock> getStock();

}
