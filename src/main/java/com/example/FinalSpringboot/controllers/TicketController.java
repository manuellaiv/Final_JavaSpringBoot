package com.example.FinalSpringboot.controllers;

import com.example.FinalSpringboot.entity.Stop;
import com.example.FinalSpringboot.entity.Ticket;
import com.example.FinalSpringboot.entity.Trip;
import com.example.FinalSpringboot.entity.TripSchedule;
import com.example.FinalSpringboot.repository.TicketRepository;
import com.example.FinalSpringboot.repository.TripRepository;
import com.example.FinalSpringboot.repository.TripScheduleRepository;
import com.example.FinalSpringboot.services.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    @Autowired
    private TripScheduleRepository tripScheduleRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping("/tickets")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<Ticket>> getTicketsByTripSchedule(@RequestParam Long tripScheduleId) {
        TripSchedule tripSchedule = tripScheduleRepository.findById(tripScheduleId)
                .orElseThrow(() -> new RuntimeException("Trip schedule not found"));
        List<Ticket> tickets = ticketRepository.findByTripSchedule(tripSchedule);
        return ResponseEntity.ok(tickets);
    }
}