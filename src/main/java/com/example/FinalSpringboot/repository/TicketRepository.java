package com.example.FinalSpringboot.repository;

import com.example.FinalSpringboot.entity.Ticket;
import com.example.FinalSpringboot.entity.Trip;
import com.example.FinalSpringboot.entity.TripSchedule;
import com.example.FinalSpringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUser(User user);

    List<Ticket> findByTripSchedule(TripSchedule tripSchedule);
}
