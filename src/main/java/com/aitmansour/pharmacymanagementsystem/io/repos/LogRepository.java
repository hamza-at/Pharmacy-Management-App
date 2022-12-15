package com.aitmansour.pharmacymanagementsystem.io.repos;

import com.aitmansour.pharmacymanagementsystem.io.entity.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository {
    Log findByLogId(String LogId);
}