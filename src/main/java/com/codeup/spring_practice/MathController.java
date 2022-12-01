package com.codeup.spring_practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{firstNum}/and/{secondNum}")
    @ResponseBody
    public int addNums(@PathVariable int firstNum, @PathVariable int secondNum) {
        return firstNum + secondNum;
    }

    @GetMapping("/subtract/{firstNum}/and/{secondNum}")
    @ResponseBody
    public int subtractNums(@PathVariable int firstNum, @PathVariable int secondNum) {
        return secondNum - firstNum;
    }

    @GetMapping("/multiply/{firstNum}/and/{secondNum}")
    @ResponseBody
    public int multiplyNums(@PathVariable int firstNum, @PathVariable int secondNum) {
        return secondNum * firstNum;
    }

    @GetMapping("/divide/{firstNum}/and/{secondNum}")
    @ResponseBody
    public float divideNums(@PathVariable int firstNum, @PathVariable int secondNum) {
        return firstNum/secondNum;
    }

}
