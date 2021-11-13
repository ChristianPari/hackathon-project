package com.hackathon.responseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responses")
public class ResponseController {

    @Autowired
    private ResponseService service;

    @GetMapping("/{user_id}")
    public List<Response> getResponsesFromUser(@PathVariable Long user_id) {
        return service.getResponsesFromUser(user_id);
    }

    @PostMapping("/{ticket_id}")
    public Response addResponseToTicket(@PathVariable Long ticket_id, @RequestBody Response response){
        return service.addResponseToTicket(ticket_id,response);
    }

}
