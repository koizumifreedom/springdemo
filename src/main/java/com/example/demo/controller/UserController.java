package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserController userService;

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public String displayList(Model model) {
            List<User> userlist = userService.searchAll();
            model.addAttribute("userlist",userlist);
            return "user/list";
    }

    private List<User> searchAll() {
        return null;
    }

    @RequestMapping(value = "/user/add",method = RequestMethod.GET)
    public String displayAdd(Model model) {
        model.addAttribute("userRequest", new UserController());
        return "user/add";
    }

    @RequestMapping(value = "/user/create",method=RequestMethod.POST)
    public String create(@ModelAttribute UserRequest userRequest) {
        userService.create(userRequest);
        return "redirect/user/list";

    }

}
