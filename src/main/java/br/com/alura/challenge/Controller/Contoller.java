package br.com.alura.challenge.Controller;

import br.com.alura.challenge.Entity.UserEntity;
import br.com.alura.challenge.Request.UserRegisterRequest;
import br.com.alura.challenge.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Contoller {

    private final UserService userService;
    @Autowired
    public Contoller(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register-user")
    public ResponseEntity<UserEntity> registerUser(@RequestBody UserRegisterRequest userRegisterRequest){
        UserEntity user = userService.saveUser(userRegisterRequest);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

}
