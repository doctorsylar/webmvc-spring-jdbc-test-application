package com.spring.controller;

import com.spring.entity.User;
import com.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping ("/")
public class MainController {

    @Autowired
    public UserService userService;

    @GetMapping ("/")
    public String homepage () {
        return "index";
    }

    @GetMapping ("/test")
    public String testLink () {
        return "test";
    }

    @GetMapping ("/login")
    public String login () {
        return "login";
    }

    @GetMapping ("/list")
    public String usersList (Model model) {
        model.addAttribute("users", userService.getAll());
        return "list";
    }

    @GetMapping ("/search")
    public ModelAndView searchPage () {
        return new ModelAndView("search", "user", new User());
    }

    @PostMapping ("/search")
    public String userSearch (@ModelAttribute("user") User user, Model model) {
        if (userService.isExisting(user.getName())) {
            model.addAttribute("user", userService.get(user.getName()));
            return "search-result";
        }
        else {
//            model.addAttribute("error", "User not found, try again");
            return "redirect:/search";
        }
    }

    @GetMapping ("/search-result")
    public String searchResult () {
        return "search-result";
    }

    @GetMapping ("/delete/{id}")
    public ModelAndView deleteRecord (@PathVariable("id") int id) {
        userService.delete(id);
        return new ModelAndView("list", "users", userService.getAll());
    }

    @GetMapping ("/update/{id}")
    public ModelAndView updateRecord (@PathVariable("id") int id) {
        return new ModelAndView("update", "user", userService.get(id));
    }

    @PostMapping ("/updateUser")
    public String updateSubmit (@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/list";
    }

    @GetMapping ("/user/{id}")
    public ModelAndView userFromList (@PathVariable("id") int id) {
        return new ModelAndView("search-result", "user", userService.get(id));
    }

    @GetMapping ("/create")
    public String createUserPage () {
        return "create";
    }

    @PostMapping ("/createUser")
    public String addUser (@ModelAttribute("user") User user) {
        userService.insert(user);
        return "redirect:/list";
    }
}
