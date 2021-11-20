package com.hackathon.ticketservice.tickets;

import com.hackathon.ticketservice.responses.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Set;

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

    public Set<Response> getResponses(Long id) {
        return repository.getById(id).getResponses();
    }

    public Ticket addTicket(Ticket ticket) {
        repository.save(ticket);
        return ticket;
    }

    public Ticket addResponse(Long id, Response response) {
        return repository.findById(id).map(ticket -> {

            ticket.getResponses().add(response);
            return repository.save(ticket);
        }).orElseThrow(TicketNotFound::new);
    }

    public void deleteTicket(Long id) {
        if (!repository.existsById(id))
            throw new TicketNotFound("Ticket with given id Not Found for deletion");
        repository.deleteById(id);
        restTemplate().delete("http://responses-service-fred555-dev.apps.sandbox.x8i5.p1.openshiftapps.com/responses/" + id, Response.class);

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
