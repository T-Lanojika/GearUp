package com.gearup.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Data

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Column(unique=false)
    private String name;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private Long stationId;

}
