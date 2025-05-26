package com.gearup.service.impl;

import com.gearup.model.serviceStation;
import com.gearup.payload.dto.StationDTO;
import com.gearup.payload.dto.UserDTO;
import com.gearup.repository.StationRepository;
import com.gearup.service.ServiceStation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceStationImpl implements ServiceStation {

    private final StationRepository stationRepository;

    @Override
    public serviceStation createStation(StationDTO req, UserDTO user) {
        serviceStation station = new serviceStation();
        station.setName(req.getName());
        station.setAddress(req.getAddress());
        station.setEmail(req.getEmail());
        station.setCity(req.getCity());
        station.setImages(req.getImages());
        station.setOwnerId(req.getOwnerId());
        station.setOpenTime(req.getOpenTime());
        station.setCloseTime(req.getCloseTime());
        station.setPhoneNumber(req.getPhoneNumber());

        return stationRepository.save(station);
    }

    @Override
    public serviceStation updateStation(StationDTO station, UserDTO user, Long stationId) throws Exception {
        serviceStation existingStation = stationRepository.findById(stationId).orElse(null);
        if(existingStation != null && station.getOwnerId().equals(user.getId())) {
            existingStation.setName(station.getName());
            existingStation.setAddress(station.getAddress());
            existingStation.setEmail(station.getEmail());
            existingStation.setCity(station.getCity());
            existingStation.setImages(station.getImages());
            existingStation.setOwnerId(station.getOwnerId());
            existingStation.setOpenTime(station.getOpenTime());
            existingStation.setCloseTime(station.getCloseTime());
            existingStation.setPhoneNumber(station.getPhoneNumber());
        }
        throw new Exception("Service Station not exist");
    }

    @Override
    public List<serviceStation> getAllStations() {
        return stationRepository.findAll();
    }

    @Override
    public serviceStation getStationById(Long stationId) throws Exception {
        serviceStation station = stationRepository.findById(stationId).orElse(null);
        if(station == null){
            throw new Exception("Service Station not exist");
        }
        return station;
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
