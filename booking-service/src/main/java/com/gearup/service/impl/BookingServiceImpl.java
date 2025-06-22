package com.gearup.service.impl;

import com.gearup.domain.BookingStatus;
import com.gearup.dto.BookingRequest;
import com.gearup.dto.ServiceDTO;
import com.gearup.dto.StationDTO;
import com.gearup.dto.UserDTO;
import com.gearup.model.Booking;
import com.gearup.model.StationReport;
import com.gearup.service.BookingService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class BookingServiceImpl implements BookingService {
    @Override
    public Booking createBooking(BookingRequest booking, UserDTO ser, StationDTO station, Set<ServiceDTO> serviceDTOSet) {
        return null;
    }

    @Override
    public List<Booking> getBookingsByCustomer(Long customerId) {
        return List.of();
    }

    @Override
    public List<Booking> getBookingsByStation(Long stationId) {
        return List.of();
    }

    @Override
    public Booking getBookingById(Long id) {
        return null;
    }

    @Override
    public Booking updateBooking(Long bookingId, BookingStatus status) {
        return null;
    }

    @Override
    public List<Booking> getBookingsByDate(LocalDate date, Long stationId) {
        return List.of();
    }

    @Override
    public StationReport getStationReport(Long stationId) {
        return null;
    }
}
