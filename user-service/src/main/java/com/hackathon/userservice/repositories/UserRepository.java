package com.hackathon.userservice.repositories;

import com.hackathon.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //get responses by ticketID
}
