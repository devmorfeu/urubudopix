package br.com.gabadev.urubudopix.controllers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class UserRequest {

    @JsonProperty
    private String name;
}
