package com.hackathon.responseservice;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "response")
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

    private Date date = Date.from(Instant.now());

    private String content;
}
