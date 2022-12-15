package com.aitmansour.pharmacymanagementsystem.service;

import com.aitmansour.pharmacymanagementsystem.io.entity.Sell;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SellService {

        Sell createSell(Sell sell);
        Sell getSellById(String sellId);
        Sell updateSellDetails(String sellId, Sell sell);
        void deleteSell(String sellId);
        List<Sell> getSell();


}
