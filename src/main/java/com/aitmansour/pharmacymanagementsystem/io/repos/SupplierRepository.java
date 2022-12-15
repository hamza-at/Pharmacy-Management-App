package com.aitmansour.pharmacymanagementsystem.io.repos;

import com.aitmansour.pharmacymanagementsystem.io.entity.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<Supplier, Long> {
    Supplier findBySupplierId(String supplierId);
    Supplier findByEmail(String email);

}
