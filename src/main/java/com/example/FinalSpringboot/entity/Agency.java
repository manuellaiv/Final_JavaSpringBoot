package com.example.FinalSpringboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
@Table(name = "Agency")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private String name;

    @Column
    private String details;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private User owner;

    @OneToMany(mappedBy = "agency", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bus> buses;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("AGENCY " + id + "\n")
                .append("code: " + code + "\n")
                .append("name: " + name + "\n")
                .append("details: " + details + "\n")
                .append("owner: " + owner + "\n");
        return builder.toString();
    }
}
