package com.hackathon.ticketservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository repository;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public List<Ticket> getTickets() {
        return repository.findAll();
    }

    public List<Ticket> getActiveTickets() {
        return repository.getAllActiveTickets("active");
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
        restTemplate().delete("http://localhost:8081/responses/"+id, Response.class);

    }

    public Ticket updateTicket(Long id, Ticket ticketUpdate) {
        return repository.findById(id).map(ticket -> {
            if (ticketUpdate.getDepartment() != null)
                ticket.setDepartment(ticketUpdate.getDepartment());
            if (ticketUpdate.getStatus() != null)
                ticket.setStatus(ticketUpdate.getStatus());
            if (ticketUpdate.getTitle() != null)
                ticket.setTitle(ticketUpdate.getTitle());
            if (ticketUpdate.getContent() != null)
                ticket.setContent(ticketUpdate.getContent());
            return repository.save(ticket);
        }).orElseThrow(TicketNotFound::new);

    }
}
