package com.hackathon.ticketservice;

import lombok.*;

import javax.persistence.*;
//import java.util.List;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ref_id")
    private UUID referenceId = UUID.randomUUID();
//    private User requester;
    private String status;
    private String subject;
    private String content;
    private Response[] responses;
//  private Boolean open;
}
