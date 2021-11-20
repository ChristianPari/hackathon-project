package com.hackathon.ticketservice.tickets;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TicketNotFound extends RuntimeException{
    public TicketNotFound() {
        super("Ticket not found");
    }

    public TicketNotFound(String message) {
        super(message);
    }
}
