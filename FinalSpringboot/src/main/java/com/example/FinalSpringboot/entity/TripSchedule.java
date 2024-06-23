package com.example.FinalSpringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TripSchedule")
public class TripSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String tripDate;

    @Column
    private Integer availableSeats;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id", referencedColumnName = "id")
    private Trip trip;

    @OneToMany(mappedBy = "tripSchedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> ticketsSold;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("TRIP SCHEDULE " + id + "\n")
                .append("seatNumber: " + tripDate + "\n")
                .append("cancellable: " + availableSeats + "\n")
                .append("journeyDate: " + trip.getId() + "\n");
        return builder.toString();
    }
}
