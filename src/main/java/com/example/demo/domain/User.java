package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    Long id;

    @Column(unique = true)
    String username;
    String password;

    Boolean enabled;

    @ElementCollection
    List<String> roles;
}
