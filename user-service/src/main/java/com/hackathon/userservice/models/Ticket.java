package com.hackathon.userservice.models;

import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private Long id;
    private UUID referenceId = UUID.randomUUID();
    private Long user_id;
    private String department;
    private String status;
    private String title;
    private String content;
    private Set<Response> responses;
}