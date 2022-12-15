package com.aitmansour.pharmacymanagementsystem.service;


import com.aitmansour.pharmacymanagementsystem.io.entity.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {
    Supplier createSupplier(Supplier supplier);
    Supplier getSupplierById(String supplierId);
    Supplier getSupplierByEmail(String email);
    Supplier updateSupplierDetails(String supplierId, Supplier supplier);
    void deleteSupplier(String supplierId);
    List<Supplier> getSupplier();
}
