package com.codeup.spring_practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String singlePost(@PathVariable int id) {
        return "post " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "form for creating a post goes here";
    }

}
