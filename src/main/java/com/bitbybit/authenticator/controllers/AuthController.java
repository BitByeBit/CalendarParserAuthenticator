package com.bitbybit.authenticator.controllers;

import com.bitbybit.authenticator.services.AuthService;
import com.google.firebase.auth.FirebaseAuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/validate")
    public ResponseEntity<String> login(@RequestBody String idToken) {
        try {
            return ResponseEntity.ok(authService.authenticate(idToken));
        } catch (FirebaseAuthException e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }
}
