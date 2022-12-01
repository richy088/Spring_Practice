package com.codeup.spring_practice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HelloController {

    @GetMapping("/hi")
    @ResponseBody
    public String hi() {
        return "Hi from Spring!";
    }

    @GetMapping("/Rich")
    @ResponseBody
    public String rich() { return "Rich is awesome"; }

    @GetMapping("/hi/{friend}")
    @ResponseBody
    public String helloFriend(@PathVariable String friend) {
        return "Hi " + friend + "!";
    }
}

//Forgot to intially add Spring web dependency at the creation of project so needed to add later in order to get GetMapping and ResponseBody to work
