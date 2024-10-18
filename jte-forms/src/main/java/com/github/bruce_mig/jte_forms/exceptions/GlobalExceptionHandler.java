package com.github.bruce_mig.jte_forms.exceptions;

import com.github.bruce_mig.jte_forms.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleValidationExceptions(MethodArgumentNotValidException ex, Model model){
        User user = (User) ex.getBindingResult().getTarget();
        model.addAttribute("user", user);
        model.addAttribute("error","Please fill out all of the required form fields.");
        log.info("User validation failed for {}", user);
        return "index";
    }
}
