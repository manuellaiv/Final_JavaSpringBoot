package com.example.FinalSpringboot.services;

import com.example.FinalSpringboot.entity.TripSchedule;
import com.example.FinalSpringboot.entity.Trip;
import com.example.FinalSpringboot.repository.TripScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripScheduleService {

    @Autowired
    private TripScheduleRepository tripScheduleRepository;

    public List<TripSchedule> searchTripSchedulesByDate(String tripDate) {
        return tripScheduleRepository.findByTripDate(tripDate);
    }
}
