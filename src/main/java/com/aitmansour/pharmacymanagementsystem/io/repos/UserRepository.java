package com.aitmansour.pharmacymanagementsystem.io.repos;

import com.aitmansour.pharmacymanagementsystem.io.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository {
    User findByEmail(String email);
    User findByUserId(String userId);
}
