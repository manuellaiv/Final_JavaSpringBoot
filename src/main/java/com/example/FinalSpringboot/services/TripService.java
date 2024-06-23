package com.example.FinalSpringboot.services;

import com.example.FinalSpringboot.entity.Trip;
import com.example.FinalSpringboot.entity.Stop;
import com.example.FinalSpringboot.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public List<Trip> searchTrips(Stop sourceStop, Stop destStop) {
        return tripRepository.findBySourceStopAndDestStop(sourceStop, destStop);
    }

    public Trip getTripById(Long id) {
        Optional<Trip> trip = tripRepository.findById(id);
        if (trip.isPresent()) {
            return trip.get();
        } else {
            throw new RuntimeException("Trip not found with id: " + id);
        }
    }

}