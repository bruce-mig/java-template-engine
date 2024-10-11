package com.github.bruce_mig.templates;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TemplateController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("username", "John Doe");
        return "pages/home";
    }

    @GetMapping("/team")
    public String team(Model model) {
        List<String> teamMembers = List.of("Alice", "Bob", "Charlie", "David");
        model.addAttribute("teamMembers",teamMembers);
        return "pages/team";
    }

    @GetMapping("/projects")
    public String projects(Model model){
        List<String> projects = List.of("Project 1", "Project 2", "Project 3", "Project 4");
        model.addAttribute("username","John Doe");
        model.addAttribute("projects", projects);
        return "pages/projects";

    }
}
