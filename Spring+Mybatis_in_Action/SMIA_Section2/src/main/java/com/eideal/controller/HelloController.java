package com.eideal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller
public class HelloController implements Controller {

    @RequestMapping(value = "/hello")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("进入了HelloController");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "hello world");
        modelAndView.setViewName("/WEB-INF/content/welcome.jsp");
        return modelAndView;
    }
}
