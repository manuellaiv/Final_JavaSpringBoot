package com.example.FinalSpringboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Bus")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private String capacity;

    @Column
    private String make;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id", referencedColumnName = "id")
    private Agency agency;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("BUS " + id + "\n")
                .append("code: " + code + "\n")
                .append("capacity: " + capacity + "\n")
                .append("make: " + make + "\n")
                .append("agency: " + agency.getId() + "\n");
        return builder.toString();
    }
}