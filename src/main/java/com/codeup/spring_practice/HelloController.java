package com.codeup.spring_practice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HelloController {

    @GetMapping("/hi")
    @ResponseBody
    public String hi() {
        return "Hi from Spring!";
    }
//    another push
}
