package com.Security.SB.Security.service;

import com.Security.SB.Security.entity.User;

public interface UserService {
    User findUserName(String userName);
     User  saveUser(User user);
}
