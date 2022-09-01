package ru.loktaevalex.crudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/addNewUser")
    public String saveNewUser(Model model) {
        model.addAttribute("user", new User());
        return "saveNewUser";
    }

    @PostMapping("/saveNewUser")
    public String saveNewUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String updateBeforeUser(Model model, @PathVariable("id") long id) {
        model.addAttribute("user", userService.getUser(id));
        return "updateUser";
    }

    @PostMapping("/updateUser/{id}")
    public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") long id) {
        userService.updateUser(id, user);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}
