package com.example.FinalSpringboot.controllers;

import com.example.FinalSpringboot.entity.Trip;
import com.example.FinalSpringboot.entity.Stop;
import com.example.FinalSpringboot.services.TripService;
import com.example.FinalSpringboot.services.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TripController {

    @Autowired
    private TripService tripService;

    @Autowired
    private StopService stopService;

    @GetMapping("/search")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public List<Trip> searchTrips(
            @RequestParam Long sourceStopId,
            @RequestParam Long destStopId) {
        Stop sourceStop = stopService.getStopById(sourceStopId);
        Stop destStop = stopService.getStopById(destStopId);
        return tripService.searchTrips(sourceStop, destStop);
    }
}