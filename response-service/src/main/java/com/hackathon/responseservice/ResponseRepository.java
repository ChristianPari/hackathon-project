package com.hackathon.responseservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {

    @Query("SELECT r FROM Response r WHERE r.user_id = :user_id")
    List<Response> findAllByUser_id(@Param("user_id") Long user_id);

    @Query("SELECT r FROM Response r WHERE r.ticket_id = :ticket_id")
    List<Response> findAllByTicket_id(@Param("ticket_id") Long ticket_id);

    @Modifying
    @Transactional
    @Query("DELETE FROM Response r WHERE r.ticket_id = :ticket_id")
    void deleteResponsesByTicket_ID(@Param("ticket_id") Long ticket_id);

}
