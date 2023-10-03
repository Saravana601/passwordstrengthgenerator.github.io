package com.Srvnn.PasswordStrengthGenerator.controller;

import com.Srvnn.PasswordStrengthGenerator.model.Password;
import com.Srvnn.PasswordStrengthGenerator.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/password-strength")
public class PasswordController {

    @Autowired
    PasswordService passwordService;

    @CrossOrigin(origins = "https://saravana601.github.io/passwordstrengthgenerator.github.io/") // Allow requests from any origin
    @PostMapping("/generate")
    public String checkPasswordStrength(@RequestBody Password password){
        return passwordService.checkPasswordStrength(password);
    }
}
