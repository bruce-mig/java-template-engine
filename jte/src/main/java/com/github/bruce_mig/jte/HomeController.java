package com.github.bruce_mig.jte;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("")
    public String home(Model model){

        Page page = new Page("Hello, Java Template Engine", "This is my home page");
        List<String> items = List.of("item1", "item2", "item3");
        model.addAttribute("name","Bruce");
        model.addAttribute("page", page);
        model.addAttribute("items", items);
        return "index";
    }
}
