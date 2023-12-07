package com.Security.SB.Security.service;

import com.Security.SB.Security.Repository.UserRepository;
import com.Security.SB.Security.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserName(String userName) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        User user1=new User(user.getUserName(),user.getPassword(),user.getFullName());
        return userRepository.save(user1);
    }
}
