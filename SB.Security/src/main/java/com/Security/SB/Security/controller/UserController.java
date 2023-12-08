package com.Security.SB.Security.controller;

import com.Security.SB.Security.entity.User;
import com.Security.SB.Security.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String register(Model theModel){
        User userIn=new User();
        theModel.addAttribute("user",userIn);
        return "register";
    }
    @PostMapping("/registerSuccess")
    public String registerSave(@ModelAttribute("user") User theUser){
        userService.saveUser(theUser);

        return "successfull";
    }

}
