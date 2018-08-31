package com.mypackage.controllers;


import com.mypackage.models.Registration;
import com.mypackage.services.RegistrationService;
import com.mypackage.validators.RegistrationValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;


    @RequestMapping(value = "/registartion")
    public String viewRegistration(Model model) {

        System.out.println("inside viewRegistration");

        model.addAttribute("registration", new Registration());
        return "registration";
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(@Validated @ModelAttribute("registration") Registration registration, BindingResult errors) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

//        if (1 == 1) {
//
//            throw new Exception("hello");
//        }

        if (errors.hasErrors()) {
            modelAndView.setViewName("registration");
            return modelAndView;

        }

        registrationService.registerUser(registration);

        return new ModelAndView("home","greeting","Successfully registered!!!");

    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new RegistrationValidation());
    }

    @ExceptionHandler(value = Exception.class)
    public String exception() {
        return "registrationexception";
    }
}
