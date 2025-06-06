package com.gearup.service;

import com.gearup.model.serviceStation;
import com.gearup.payload.dto.StationDTO;
import com.gearup.payload.dto.UserDTO;

import java.util.List;

public interface ServiceStation {
    serviceStation createStation(StationDTO station, UserDTO user);

    serviceStation updateStation(StationDTO station, UserDTO user,Long stationId) throws Exception;

    List<serviceStation> getAllStations();

    serviceStation getStationById(Long stationId) throws Exception;

    serviceStation getStationByOwnerId(Long ownerId);

    List<serviceStation> searchStationByCity(String city);

}
