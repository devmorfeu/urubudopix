package br.com.gabadev.urubudopix.controllers;

import br.com.gabadev.urubudopix.controllers.model.UserRequest;
import br.com.gabadev.urubudopix.usecases.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserUseCase userUseCase;

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@RequestBody UserRequest userRequest) {

       userUseCase.createUser(userRequest);

       return ResponseEntity.status(NO_CONTENT).build();
    }
}
