package com.spring.controller;

import com.spring.entity.User;
import com.spring.entity.mages.MageImpl;
import com.spring.services.CharacterService;
import com.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping ("/")
public class MainController {

    @Autowired
    public UserService userService;

    @Autowired
    public CharacterService characterService;

    @GetMapping ("/")
    public String homepage () {
        return "index";
    }

    @GetMapping ("/test")
    public String testLink () {
        return "test";
    }

    @GetMapping ("/list")
    public ModelAndView usersList () {
//        model.addAttribute("users", userService.getAll());
//        return "list";
        return new ModelAndView("list", "users", userService.getAll());
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
        ModelAndView page = new ModelAndView("search-result", "user", userService.get(id));
        page.addObject("characters", characterService.getAllForUser(userService.get(id)));
        return page;
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

    @GetMapping ("/login")
    public String loginPage () {
        return "login";
    }

    @PostMapping ("/login")
    public String loginHandler (@Valid @ModelAttribute("user") User user,
                                BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            if (!userService.isExisting(user.getName())) {
                return "failure";
            }
            else {
                if (user.getPassword().equals(userService.get(user.getName()).getPassword())) {
                    return "redirect:/user/" + userService.get(user.getName()).getId();
                }
            }
            return "failure";
        }
        else {
            model.addAttribute("user", user);
            return "login";
        }



    }

    @GetMapping ("/registration")
    public String registrationPage () {
        return "registration";
    }

    @PostMapping ("/registration")
    public String registrationHandler (@Valid @ModelAttribute("user") User user,
                                       BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            if (userService.isExisting(user.getName())) {
                return "failure";
            }
            else {
                userService.insert(user);
                return "success";
            }
        }
        else {
            model.addAttribute("user", user);
            return "/registration";
        }

    }

    @GetMapping ("/user/{id}/character-creation")
    public ModelAndView characterCreationPage (@PathVariable("id") int id) {
        return new ModelAndView("character-creation", "id", id);
//        return "character-creation";
    }

    @PostMapping ("/user/{id}/character-creation")
    public String characterCreationSubmit (@PathVariable("id") @ModelAttribute("character") int id, MageImpl mage) {
        characterService.insert(mage, id);
        return "redirect:/user/" + id;
    }

    @GetMapping ("/user/{user-id}/delete/{character-id}")
    public String deleteCharacter (@PathVariable("user-id") int userId,
                                   @PathVariable("character-id") int characterId) {
        characterService.delete(characterId);
        return "redirect:/user/" + userId;
    }

    @GetMapping ("/battle")
    public String battle () {
        return "battle";
    }
}
