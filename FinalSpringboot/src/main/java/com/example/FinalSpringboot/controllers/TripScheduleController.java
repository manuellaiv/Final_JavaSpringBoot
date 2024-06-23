package com.example.FinalSpringboot.controllers;

import com.example.FinalSpringboot.entity.TripSchedule;
import com.example.FinalSpringboot.entity.Trip;
import com.example.FinalSpringboot.services.TripScheduleService;
import com.example.FinalSpringboot.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tripschedule")
public class TripScheduleController {

    @Autowired
    private TripScheduleService tripScheduleService;

    @Autowired
    private TripService tripService;

    @GetMapping("/search")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public List<TripSchedule> searchTripSchedules(@RequestParam String tripDate) {
        return tripScheduleService.searchTripSchedulesByDate(tripDate);
    }
}
