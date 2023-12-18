package ir.java.up.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class HomeController {
    @GetMapping("/index")
    public String home()
    {return "hello";}
    @GetMapping("/home")
    public String home1()
    {return  "home";}

    @GetMapping("/sum/{num1}/{num2}")
    public Long sum(@PathVariable Long num1,@PathVariable Long num2){
        return num1+num2;
    }
    @GetMapping("/avg")
    public Long avg(@RequestParam Long num1, @RequestParam Long num2){
        return num1*num2;
    }
}
