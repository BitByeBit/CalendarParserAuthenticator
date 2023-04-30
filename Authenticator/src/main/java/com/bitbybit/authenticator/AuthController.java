package com.bitbybit.authenticator;

import com.google.firebase.auth.FirebaseAuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/validate")
    public String login(@RequestBody String idToken) throws FirebaseAuthException {
        return authService.authenticate(idToken);
    }
}
