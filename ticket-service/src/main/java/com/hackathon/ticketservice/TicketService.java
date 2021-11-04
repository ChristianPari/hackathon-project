package com.hackathon.ticketservice;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TicketService {
    @Autowired
    private TicketRepository repository;

    public List<Ticket> getTickets() {
        return repository.findAll();
    }

    public List<Response> getResponses(Long id) {
        return repository.getById(id).getResponses();
    }
}
