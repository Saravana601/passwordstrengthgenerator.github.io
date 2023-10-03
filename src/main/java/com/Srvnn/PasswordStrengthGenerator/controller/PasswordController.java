package com.Srvnn.PasswordStrengthGenerator.controller;

import com.Srvnn.PasswordStrengthGenerator.model.Password;
import com.Srvnn.PasswordStrengthGenerator.service.PasswordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/password-strength")
public class PasswordController {

    @Autowired
    PasswordService passwordService;

    private final Logger logger = LoggerFactory.getLogger(PasswordController.class);


    @CrossOrigin(origins = "https://saravana601.github.io/passwordstrengthgenerator.github.io/") // Allow requests from any origin
    @PostMapping("/generate")
    public String checkPasswordStrength(@RequestBody Password password){
        logger.info("Received a request to check password strength with value: " + password.getPassword());
        String result = passwordService.checkPasswordStrength(password);
        logger.info("Result: " + result);
        return result;
    }
}
