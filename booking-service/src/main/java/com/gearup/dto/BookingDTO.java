package com.gearup.dto;

import com.gearup.domain.BookingStatus;
import jakarta.persistence.ElementCollection;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDTO {
    private Long id;
    private Long stationId;
    private Long customerId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Set<Long> serviceIds;
    private BookingStatus status = BookingStatus.PENDING;
    private int totalPrice;
}
