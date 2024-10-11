package com.github.bruce_mig.jte_forms;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository repository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/save")
    public String saveUser(@Valid User user, Model model){
        repository.save(user);
        model.addAttribute("message","User information was saved successfully");
        return "index";
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleValidationExceptions(MethodArgumentNotValidException ex, Model model){
        User user = (User) ex.getBindingResult().getTarget();
        model.addAttribute("user", user);
        model.addAttribute("error","Please fill out all of the required form fields.");
        log.info("User validation failed for {}", user);
        return "index";
    }


}
