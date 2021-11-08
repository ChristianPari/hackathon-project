package com.hackathon.ticketservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository repository;

    public List<Ticket> getTickets() {
        return repository.findAll();
    }

    public List<Ticket> getActiveTickets() {
        return repository.getAllByStatus("active");
    }

    public List<Response> getResponses(Long id) {
        return Arrays.asList(repository.getById(id).getResponses());
    }

    public Ticket addTicket(Ticket ticket) {
        repository.save(ticket);
        return ticket;
    }

    public void deleteTicket(Long id) {
        if (!repository.existsById(id))
            throw new TicketNotFound("Ticket with given id Not Found for deletion");
        repository.deleteById(id);
    }
}
