package com.gearup.controller;

import com.gearup.mapper.StationMapper;
import com.gearup.model.serviceStation;
import com.gearup.payload.dto.StationDTO;
import com.gearup.payload.dto.UserDTO;
import com.gearup.service.ServiceStation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<StationDTO>> getStation() throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        List<serviceStation> stations = servicestation.getAllStations();

        List<StationDTO> stationDTOS= stations.stream().map((station)->{
            StationDTO stationDTO= StationMapper.mapToDTO(station);
            return stationDTO;
                }

        ).toList();
        return ResponseEntity.ok(stationDTOS);
    }

    @GetMapping("/{stationId}")
    public ResponseEntity<StationDTO> getStationById(@PathVariable Long stationId) throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);

        serviceStation station = servicestation.getStationById(stationId);
        StationDTO stationDTO= StationMapper.mapToDTO(station);

        return ResponseEntity.ok(stationDTO);
    }

}
