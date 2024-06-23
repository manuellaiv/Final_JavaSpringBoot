package com.example.FinalSpringboot.repository;

import com.example.FinalSpringboot.entity.Stop;
import com.example.FinalSpringboot.entity.Trip;
import com.example.FinalSpringboot.entity.TripSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findBySourceStopAndDestStop(Stop sourceStop, Stop destStop);
}
