package com.Security.SB.Security.service;

import com.Security.SB.Security.Repository.UserRepository;
import com.Security.SB.Security.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    private UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;



@Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Override
//    public User findUserName(String email) {
//        return null;
//    }

    @Override
    public User saveUser(User user) {
       User user1=new User(user.getFirstName(),user.getLastName(),user.getUserName(),user.getEmail(), passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user1);
    }
}
