package com.hackathon.responseservice.controller;

import com.hackathon.responseservice.entity.Response;
import com.hackathon.responseservice.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responses")
public class ResponseController {

    @Autowired
    private ResponseService service;

    @GetMapping("/{ticket_id}")
    public List<Response> getResponsesFromTicket(@PathVariable Long ticket_id) {
        return service.getResponsesFromTicket(ticket_id);
    }

    @DeleteMapping("/{ticket_id}")
    public void deleteResponsesOfTicket(@PathVariable Long ticket_id){
        service.deleteResponsesOfTicket(ticket_id);
    }

    @GetMapping("/all")
    public List<Response> getAllResponses(){
        return service.getAllResponses();
    }

    @GetMapping
    //responses?userid
    public List<Response> getResponsesFromUser(@RequestParam Long user_id) {
        return service.getResponsesFromUser(user_id);
    }

    @PostMapping("/{ticket_id}")
    public Response addResponseToTicket(@PathVariable Long ticket_id, @RequestBody Response response) {
        return service.addResponseToTicket(ticket_id, response);
    }

    @PutMapping("/{id}")
    public Response editResponse(@PathVariable Long id,@RequestBody Response responseUpdate){
        return service.editResponse(id, responseUpdate);
    }

}
