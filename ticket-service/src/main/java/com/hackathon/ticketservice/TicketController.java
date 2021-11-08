package com.hackathon.ticketservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    public TicketService service;

    @GetMapping
    public List<Ticket> getTickets() {
        return service.getTickets();
    }

    @GetMapping("/active")
    public List<Ticket> getActiveTickets() {
        return service.getActiveTickets();
    }

    @PostMapping
    public Ticket addTicket(@RequestBody Ticket ticket) {
        return service.addTicket(ticket);
    }

    @GetMapping("/{id}")
    public List<Response> getResponses(@PathVariable Long id) {
        return service.getResponses(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        service.deleteTicket(id);
    }
}
