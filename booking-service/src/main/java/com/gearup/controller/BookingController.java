package com.gearup.controller;

import com.gearup.dto.*;
import com.gearup.model.Booking;
import com.gearup.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> createBooking(
            @RequestParam Long stationId,
            @RequestBody BookingRequest bookingRequest
            ) throws Exception {

        UserDTO user = new UserDTO();
        user.setId(1L);

        StationDTO station = new StationDTO();
        station.setId(stationId);

        Set<ServiceDTO> serviceDTOSet = new HashSet<>();

        ServiceDTO serviceDTO = new ServiceDTO();

        serviceDTO.setId(1L);
        serviceDTO.setPrice(399);
        serviceDTO.setDuration(45);
        serviceDTO.setName("car wash");

        serviceDTOSet.add(serviceDTO);

        Booking booking = bookingService.createBooking(bookingRequest,user,station,serviceDTOSet);

        return  ResponseEntity.ok(booking);

        }


}
