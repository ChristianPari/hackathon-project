package com.hackathon.ticketservice;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private Long id;
  private String firstName;
  private String lastName;
  private String password;
  private String[] roles;
//  private Integer issuesHandled;
}
