package br.com.gabadev.urubudopix.controllers;

import br.com.gabadev.urubudopix.controllers.model.TransactionalRequest;
import br.com.gabadev.urubudopix.usecases.DepositUseCase;
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
public class MonetaryTransactionController {

    private final DepositUseCase depositUseCase;

    @PostMapping("/investment")
    public ResponseEntity<?> cashDeposit(@RequestBody TransactionalRequest transactionalRequest) {

        depositUseCase.cashDeposit(transactionalRequest);

        return ResponseEntity.status(NO_CONTENT).build();
    }
}
