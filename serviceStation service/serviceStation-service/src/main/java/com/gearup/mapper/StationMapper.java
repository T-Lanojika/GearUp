package com.gearup.mapper;

import com.gearup.model.serviceStation;
import com.gearup.payload.dto.StationDTO;

public class StationMapper {

    public static StationDTO mapToDTO(serviceStation station) {
        StationDTO stationDTO = new StationDTO();
        stationDTO.setId(station.getId());
        stationDTO.setName(station.getName());
        stationDTO.setAddress(station.getAddress());
        stationDTO.setCity(station.getCity());
        stationDTO.setImages(station.getImages());
        stationDTO.setCloseTime(station.getCloseTime());
        stationDTO.setOpenTime(station.getOpenTime());
        stationDTO.setPhoneNumber(station.getPhoneNumber());
        stationDTO.setOwnerId(station.getOwnerId());
        stationDTO.setEmail(station.getEmail());

        return stationDTO;
    }
}
