package com.hackathon.userservice.models;

import javax.persistence.*;

import lombok.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "user")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String departments; // general | back | front | both
    private String[] roles;
}
