package br.com.alura.challenge.Controller;

import br.com.alura.challenge.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {

    private final UserService userService;
    @Autowired
    public Contoller(UserService userService) {
        this.userService = userService;
    }

}
