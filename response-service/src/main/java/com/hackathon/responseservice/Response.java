package com.hackathon.responseservice;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "response")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long ticket_id;
    private Long user_id;
    private String content;
}
