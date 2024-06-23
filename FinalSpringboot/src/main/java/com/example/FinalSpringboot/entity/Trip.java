package com.example.FinalSpringboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Trip")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer fare;

    @Column
    private String journeyTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_stop_id", referencedColumnName = "id")
    private Stop sourceStop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dest_stop_id", referencedColumnName = "id")
    private Stop destStop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id", referencedColumnName = "id")
    private Bus bus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id", referencedColumnName = "id")
    private Agency agency;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("TRIP " + id + "\n")
                .append("fare: " + fare + "\n")
                .append("journeyTime: " + journeyTime + "\n")
                .append("sourceStop: " + sourceStop.getId() + "\n")
                .append("destStop: " + destStop.getId() + "\n")
                .append("bus: " + bus.getId() + "\n")
                .append("agency: " + agency.getId() + "\n");
        return builder.toString();
    }
}
