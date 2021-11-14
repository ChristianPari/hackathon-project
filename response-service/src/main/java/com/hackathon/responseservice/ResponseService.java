package com.hackathon.responseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository repository;

    public List<Response> getResponsesFromUser(Long user_id) {
        return repository.findAllByUser_id(user_id);
    }

    public List<Response> getResponsesFromTicket(Long ticket_id) {
        return repository.findAllByTicket_id(ticket_id);
    }

    public Response addResponseToTicket(Long ticket_id, Response response) {
        response.setTicket_id(ticket_id);
        return repository.save(response);
    }

    public Response editResponse(Long id, Response responseUpdate) {
        Response response = repository.getById(id);
        if (responseUpdate.getContent() != null)
            response.setContent(responseUpdate.getContent());
        repository.save(response);
        return repository.getById(id);
    }

    public List<Response> getAllResponses() {
        return repository.findAll();
    }

    public void deleteResponsesOfTicket(Long ticket_id) {
        repository.deleteResponsesByTicket_ID(ticket_id);
    }
}
