package com.gearup.service.impl;

import com.gearup.model.serviceStation;
import com.gearup.payload.dto.StationDTO;
import com.gearup.payload.dto.UserDTO;
import com.gearup.service.ServiceStation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStationImpl implements ServiceStation {
    @Override
    public serviceStation createStation(StationDTO station, UserDTO user) {
        return null;
    }

    @Override
    public serviceStation updateStation(StationDTO station, UserDTO user, Long stationId) {
        return null;
    }

    @Override
    public List<serviceStation> getAllStations() {
        return List.of();
    }

    @Override
    public serviceStation getStationById(Long stationId) {
        return null;
    }

    @Override
    public serviceStation getStationByOwnerId(Long ownerId) {
        return null;
    }

    @Override
    public List<serviceStation> searchStationByCity(String city) {
        return List.of();
    }
}
