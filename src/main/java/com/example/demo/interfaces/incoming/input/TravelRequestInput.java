package com.example.demo.interfaces.incoming.input;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class TravelRequestInput {
    @NotNull(message = "O campo passengerId não pode ser nulo")
    Long passengerId;
    String rafael;
    @NotEmpty(message = "O campo origin não pode estar em branco")
    String origin;
    @NotEmpty(message = "O campo destination não pode estar em branco")
    String destination;
}
