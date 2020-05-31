package com.pra.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name",required = false, defaultValue="Pra Web Application") String name2, Model model){
        model.addAttribute("name1",name2);
        return "welcome";
    }

}
