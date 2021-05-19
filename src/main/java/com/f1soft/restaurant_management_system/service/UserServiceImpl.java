/**
 * @author Arjun Gautam
 * Project :restaurant_management_system
 * Date : 2021-05-19
 */
package com.f1soft.restaurant_management_system.service;

import com.f1soft.restaurant_management_system.model.User;
import com.f1soft.restaurant_management_system.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        String pwd = user.getPassword();
        String encryptedPwd = new BCryptPasswordEncoder().encode(pwd);
        user.setPassword(encryptedPwd);
        return userRepository.save(user);
    }

}
