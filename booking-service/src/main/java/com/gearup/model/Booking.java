package com.gearup.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long stationId;
    private Long customerId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ElementCollection
    private Set<Long> serviceIds;
    private BookingStatus status;
    private int totalServices;
}
