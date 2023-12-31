package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Passenger {
    @Id
    @GeneratedValue
    Long id;
    String name;
}
