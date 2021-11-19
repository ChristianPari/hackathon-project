package com.hackathon.responseservice.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//unique

    //get all responses from a certain ticket
    private Long ticket_id;

    //get all responses from a certain user
    private Long user_id;

    private String content;
}
