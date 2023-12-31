package com.example.demo.domain;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@Schema(description = "Representa um motorista dentro da plataforma")
public class Driver {
    @Id
    @GeneratedValue
    Long id;
    @Schema(description = "Nome do motorista")
    @Size(min = 5, max = 255)
    String name;

    @Schema(description = "Data de nascimento do motorista")
    Date birthDate;
}
