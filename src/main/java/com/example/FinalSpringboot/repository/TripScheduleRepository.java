package com.example.FinalSpringboot.repository;

import com.example.FinalSpringboot.entity.Trip;
import com.example.FinalSpringboot.entity.TripSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripScheduleRepository extends JpaRepository<TripSchedule, Long> {
    List<TripSchedule> findByTripDate(String tripDate);
}
