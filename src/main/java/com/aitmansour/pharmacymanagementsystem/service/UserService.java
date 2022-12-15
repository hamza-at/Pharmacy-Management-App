package com.aitmansour.pharmacymanagementsystem.service;
import com.aitmansour.pharmacymanagementsystem.io.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User createUser(User user);
    User getUserById(String userId);
    User getUserByEmail(String email);
    User updateUserDetails(String userId, User user);
    void deleteUser(String userId);
    List<User> getUser();
}
