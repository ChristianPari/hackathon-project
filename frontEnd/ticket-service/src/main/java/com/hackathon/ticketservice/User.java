package com.hackathon.ticketservice;

import lombok.*;
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
  private List<String> roles;
//  private Integer issuesHandled;
}
