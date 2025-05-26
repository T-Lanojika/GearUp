package com.gearup.controller;

import com.gearup.mapper.StationMapper;
import com.gearup.model.serviceStation;
import com.gearup.payload.dto.StationDTO;
import com.gearup.payload.dto.UserDTO;
import com.gearup.service.ServiceStation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/serviceStations")
@RequiredArgsConstructor
public class StationController {

    private final ServiceStation servicestation;

    @PutMapping
    public ResponseEntity<StationDTO> createStation(@RequestBody StationDTO stationDTO){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        serviceStation station = servicestation.createStation(stationDTO,userDTO);
        StationDTO stationDTO1= StationMapper.mapToDTO(station);
        return ResponseEntity.ok(stationDTO1);
    }
    @PatchMapping
    public ResponseEntity<StationDTO> updateStation(
            @PathVariable("id") Long stationId,
            @RequestBody StationDTO stationDTO) throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        serviceStation station = servicestation.updateStation(stationDTO,userDTO,stationId);
        StationDTO stationDTO1= StationMapper.mapToDTO(station);
        return ResponseEntity.ok(stationDTO1);
    }
}
