package com.hackathon.ticketservice.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hackathon.ticketservice.tickets.Ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne
    @JoinColumn(name="ticket_id",referencedColumnName = "id")
    @JsonIgnoreProperties({"responses"})
    private Ticket ticket;
}
