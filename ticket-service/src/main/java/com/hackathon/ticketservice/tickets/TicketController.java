package com.hackathon.ticketservice.tickets;

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

//TODO send a request to response service with ticket_id

//create response in response service
    //send it to ticket to add it

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        service.deleteTicket(id);
    }

    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id,
                               @RequestBody Ticket ticket){
        return service.updateTicket(id,ticket);
    }
}
