package com.example.FinalSpringboot.entity;

import com.example.FinalSpringboot.enums.ERole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("ROLE " + id + "\n")
                .append("role: " + name + "\n");
        return builder.toString();
    }
}
