package com.torry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    @Controller
    public class MyController {
        @RequestMapping("/login")
        public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
            String userName = request.getParameter("username");
            String password = request.getParameter("password");
            ModelAndView mv = new ModelAndView();
            mv.setViewName("login.jsp");
            return mv;
        }
    }

