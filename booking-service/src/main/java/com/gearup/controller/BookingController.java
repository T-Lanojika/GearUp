package com.gearup.controller;

import com.gearup.domain.BookingStatus;
import com.gearup.dto.*;
import com.gearup.mapper.BookingMapper;
import com.gearup.model.Booking;
import com.gearup.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

        @GetMapping("/customer")
        public ResponseEntity<Set<BookingDTO>> getBookingsByCustomer(

        ){
            List<Booking> bookings = bookingService.getBookingsByCustomer(1L);

            return ResponseEntity.ok(getBookingDTOs(bookings));
        }


    @GetMapping("/station")
    public ResponseEntity<Set<BookingDTO>> getBookingsByStation(

    ){
        List<Booking> bookings = bookingService.getBookingsByStation(1L);

        return ResponseEntity.ok(getBookingDTOs(bookings));
    }

    private Set<BookingDTO> getBookingDTOs(List<Booking> bookings){
        return  bookings.stream().map(booking -> {
            return BookingMapper.toDTO(booking);
        }).collect(Collectors.toSet());
    }

    @GetMapping("/{bookingId}")
    public ResponseEntity<BookingDTO> getBookingById(
            @PathVariable Long bookingId

    )throws Exception{
        Booking booking = bookingService.getBookingById(bookingId);

        return ResponseEntity.ok(BookingMapper.toDTO(booking));
    }


    @PutMapping("/{bookingId}/status")
    public ResponseEntity<BookingDTO> updateBookingStatus(
            @PathVariable Long bookingId,
            @RequestParam BookingStatus status

            )throws Exception{
        Booking booking = bookingService.updateBooking(bookingId,status);

        return ResponseEntity.ok(BookingMapper.toDTO(booking));
    }

    @GetMapping("/slots/station/{stationId}/date/{date}")
    public ResponseEntity<List<BookingSlotDTO>> getBookedSlot(
            @PathVariable Long stationId,
            @RequestParam LocalDate date
            )throws Exception{
        List<Booking> bookings = bookingService.getBookingsByDate(date,stationId);

        List<BookingSlotDTO> slotDTOs = bookings.stream().map(booking -> {
            BookingSlotDTO slotDTO = new BookingSlotDTO();
            slotDTO.setStartTime(booking.getStartTime());
            slotDTO.setEndTime(booking.getEndTime());
            return  slotDTO;
        }).collect(Collectors.toList());

        return ResponseEntity.ok(slotDTOs);
    }

}
