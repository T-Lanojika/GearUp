package com.gearup.service;

import com.gearup.dto.BookingRequest;
import com.gearup.dto.ServiceDTO;
import com.gearup.dto.StationDTO;
import com.gearup.dto.UserDTO;
import com.gearup.model.Booking;

import java.util.Set;

public interface BookingService {

    Booking createBooking(BookingRequest booking,
                          UserDTO ser,
                          StationDTO station,
                          Set<ServiceDTO> serviceDTOSet);
}
