package com.hackathon.ticketservice;

import lombok.*;

import javax.persistence.*;
//import java.util.List;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID referenceId = UUID.randomUUID();
    private String department;
    private String status;
    private String title;
    private String content;
    private Response[] responses;

    public void addResponse(Response response){
        responses[responses.length]=response;
    }

//  private Boolean open;
}
