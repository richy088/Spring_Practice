package com.codeup.spring_practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value="/home", method = RequestMethod.GET)
    @ResponseBody
    public String landingPage() {
        return "This is the landing page!";
    }
}
