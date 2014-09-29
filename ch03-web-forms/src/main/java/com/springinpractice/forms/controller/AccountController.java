package com.springinpractice.forms.controller;

import com.springinpractice.forms.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: Daniel
 */

@Controller
@RequestMapping("/users")
public class AccountController {

    @RequestMapping(method = RequestMethod.GET)
    public String getRegistrationForm(Model model) {
        model.addAttribute("account", new Account());
        return "users/registrationForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String postRegistrationForm(Account account) {
        System.out.println("Saving: " + account);
        return "redirect:users/registration_ok";
    }

    @RequestMapping(value = "/registration_ok", method = RequestMethod.GET)
    public String registrationOk() {
        return "registration_ok";
    }

}
