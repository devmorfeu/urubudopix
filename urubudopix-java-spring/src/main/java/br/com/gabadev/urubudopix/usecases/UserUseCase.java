package br.com.gabadev.urubudopix.usecases;

import br.com.gabadev.urubudopix.controllers.model.UserRequest;
import br.com.gabadev.urubudopix.entities.UserData;
import br.com.gabadev.urubudopix.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserUseCase {

    private final UserRepository userRepository;

    public void createUser(final UserRequest userRequest) {
        userRepository.save(new UserData(userRequest));
    }
}