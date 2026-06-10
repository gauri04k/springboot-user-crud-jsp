package com.jsp.UserCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.jsp.UserCRUD.model.User;
import com.jsp.UserCRUD.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("users",
                service.getAllUsers());

        return "index";
    }

    @PostMapping("/save")
    public String save(User user) {

        service.saveUser(user);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {

        service.deleteUser(id);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,
            Model model) {

        model.addAttribute("user",
                service.getUserById(id));

        return "edit";
    }

    @PostMapping("/update")
    public String update(User user) {

        service.saveUser(user);

        return "redirect:/";
    }
}