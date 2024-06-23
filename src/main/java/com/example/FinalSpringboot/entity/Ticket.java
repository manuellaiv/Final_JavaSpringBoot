package com.example.FinalSpringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer seatNumber;

    @Column
    private Boolean cancellable;

    @Column
    private String journeyDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_schedule_id", referencedColumnName = "id")
    private TripSchedule tripSchedule;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("TICKET " + id + "\n")
                .append("seatNumber: " + seatNumber + "\n")
                .append("cancellable: " + cancellable + "\n")
                .append("journeyDate: " + journeyDate + "\n")
                .append("passenger: " + user.getId() + "\n")
                .append("tripSchedule: " + tripSchedule + "\n");
        return builder.toString();
    }
}
