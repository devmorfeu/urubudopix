package br.com.gabadev.urubudopix.repositories;

import br.com.gabadev.urubudopix.entities.UserData;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserData, Long> {}