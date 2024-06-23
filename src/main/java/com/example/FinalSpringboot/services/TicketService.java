package com.example.FinalSpringboot.services;

import com.example.FinalSpringboot.entity.Ticket;
import com.example.FinalSpringboot.entity.TripSchedule;
import com.example.FinalSpringboot.entity.User;
import com.example.FinalSpringboot.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket bookTicket(User user, TripSchedule tripSchedule, int seatNumber) {
        Ticket ticket = new Ticket();
        ticket.setUser(user);
        ticket.setTripSchedule(tripSchedule);
        ticket.setSeatNumber(seatNumber);
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getTicketsByUser(User user) {
        return ticketRepository.findByUser(user);
    }

    public List<Ticket> getTicketsByTripSchedule(TripSchedule tripSchedule) {
        return ticketRepository.findByTripSchedule(tripSchedule);
    }

}