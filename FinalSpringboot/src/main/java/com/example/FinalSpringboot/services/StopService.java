package com.example.FinalSpringboot.services;

import com.example.FinalSpringboot.entity.Stop;
import com.example.FinalSpringboot.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StopService {

    @Autowired
    private StopRepository stopRepository;

    public List<Stop> getAllStops() {
        return stopRepository.findAll();
    }

    public Stop getStopById(Long id) {
        Optional<Stop> stop = stopRepository.findById(id);
        if (stop.isPresent()) {
            return stop.get();
        } else {
            throw new RuntimeException("Stop not found with id: " + id);
        }
    }
}
