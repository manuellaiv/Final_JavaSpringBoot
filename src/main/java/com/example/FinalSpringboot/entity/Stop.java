package com.example.FinalSpringboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "Stop", indexes = @Index(columnList = "code"))
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Stop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private String name;

    @Column
    private String detail;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("STOP " + id + "\n")
                .append("code: " + code + "\n")
                .append("name: " + name + "\n")
                .append("detail: " + detail + "\n");
        return builder.toString();
    }
}
