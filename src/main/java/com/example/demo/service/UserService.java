package com.example.demo.service;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
@Service
public interface UserService {
    User register(User user);
    Optional<User> findbyemail(String email);
    
}
