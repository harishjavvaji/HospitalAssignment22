package com.mypackage.services;

import com.mypackage.models.Login;
import com.mypackage.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

//import javax.servlet.ServletContext;
import java.util.Map;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;


    public Map checkLogin(Login login) {
        Map hashMap = loginRepository.checkLogin(login);
        return hashMap;
    }

    public ModelAndView validateLogin(Login login, Map hashMap) {
        ModelAndView modelAndView = new ModelAndView();

        if (login.getPassword().equals(hashMap.get("password"))) {
            modelAndView.setViewName("loginHome");
            modelAndView.addObject("login", login);
            modelAndView.addObject("greeting", "Successfully logged in!!!");

            

        }else {
            modelAndView.setViewName("login");
            modelAndView.addObject("error", "Invalid Username or Password");
        }

        return modelAndView;

    }
}
