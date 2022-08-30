package ru.loktaevalex.crudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.loktaevalex.crudapp.model.User;
import ru.loktaevalex.crudapp.service.UserService;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showAllUser(Model model) {
        List<User> allUser = userService.getAllUser();
        model.addAttribute("user", allUser);
        return "index";
    }
}
