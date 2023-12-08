package com.Security.SB.Security.service;

import com.Security.SB.Security.Repository.UserRepository;
import com.Security.SB.Security.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
@Service

public class CustomUserDetailsService implements UserDetailsService {
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findByUserName(username);
        if (user==null){
            throw new UsernameNotFoundException("uer is wrong pls try again");
        }
        return new CustomUserDetails(
                user.getEmail(),
                user.getUserName(),
                user.getPassword(),
                user.getFirstName(),
                user.getLastName(),
                authorities());

    }
    public Collection<? extends GrantedAuthority> authorities(){
        return Arrays.asList(new SimpleGrantedAuthority("USER"));

    }

}
