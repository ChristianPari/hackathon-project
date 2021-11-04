package com.hackathon.userservice;

import javax.persistence.*;

import lombok.*;

import java.util.List;

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
    private String firstName;
    private String lastName;
    private String password;
    private List<Integer> departments; // 0 - Gen 1 - Back 2 - Front
    private List<String> roles;
//  private Integer issuesHandled;
}
