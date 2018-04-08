package com.spring.controller;

import com.spring.entity.User;
import com.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String searchPage (Model model) {
//        return new ModelAndView("search", "user", new User());
        model.addAttribute("error", "");
        return "search";
    }

    @PostMapping ("/search")
    public String userSearch (@ModelAttribute("user") User user, Model model) {
        if (userService.isExisting(user.getName())) {
            model.addAttribute("user", userService.get(user.getName()));
            return "search-result";
        }
        else {
            model.addAttribute("error", "User not found, try again");
            return "redirect:/search";
        }
    }

    @GetMapping ("/search-result")
    public String searchResult () {
        return "search-result";
    }
}
