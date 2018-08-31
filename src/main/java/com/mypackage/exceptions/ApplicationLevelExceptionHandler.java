package com.mypackage.exceptions;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ApplicationLevelExceptionHandler implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o,
                                         Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("applicationlevelexceptionhandler");
        modelAndView.addObject("message", "apllication level exception handling");
        return modelAndView;
    }
}
