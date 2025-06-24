package com.gearup.mapper;

import com.gearup.dto.BookingDTO;
import com.gearup.model.Booking;

public class BookingMapper {

    public  static BookingDTO toDTO(Booking booking){
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setId(booking.getId());
        bookingDTO.setCustomerId(booking.getCustomerId());
        bookingDTO.setStatus(booking.getStatus());
        bookingDTO.setEndTime(booking.getEndTime());
        bookingDTO.setStartTime(booking.getStartTime());
        bookingDTO.setStationId(booking.getStationId());
        bookingDTO.setServiceIds(booking.getServiceIds());

        return bookingDTO;
    }
}
