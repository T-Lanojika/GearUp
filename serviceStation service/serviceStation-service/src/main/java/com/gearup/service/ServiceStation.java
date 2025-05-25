package com.gearup.service;

import com.gearup.model.serviceStation;
import com.gearup.payload.dto.StationDTO;
import com.gearup.payload.dto.UserDTO;

import java.util.List;

public interface ServiceStation {
    serviceStation createStation(StationDTO station, UserDTO user);

    serviceStation updateStation(StationDTO station, UserDTO user,Long stationId);

    List<serviceStation> getAllStations();

    serviceStation getStationById(Long stationId);

    serviceStation getStationByOwnerId(Long ownerId);

    List<serviceStation> searchStationByCity(String city);

}
