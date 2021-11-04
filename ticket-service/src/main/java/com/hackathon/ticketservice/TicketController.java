package com.hackathon.ticketservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tickets")
public class TicketController {

    @Autowired
    public TicketService ticketService;

    @GetMapping
    public List<Ticket> getTickets() {
        return ticketService.getTickets();
    }

    @GetMapping("/id")
    public List<Response> getResponses(@PathVariable Long id) {
        return ticketService.getResponses(id);
    }
}
