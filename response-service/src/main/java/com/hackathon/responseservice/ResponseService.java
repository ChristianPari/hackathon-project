package com.hackathon.responseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository repository;

    public List<Response> getResponsesFromUser(Long user_id) {
        return repository.findAllByUser_id(user_id);
    }

    public Response addResponseToTicket(Long ticket_id, Response response) {
        response.setTicket_id(ticket_id);
        return repository.save(response);
    }
}
