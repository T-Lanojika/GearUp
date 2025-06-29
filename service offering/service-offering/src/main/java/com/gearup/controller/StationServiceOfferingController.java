package com.gearup.controller;

import com.gearup.dto.CategoryDTO;
import com.gearup.dto.ServiceDTO;
import com.gearup.dto.StationDTO;
import com.gearup.model.ServiceOffering;
import com.gearup.service.ServiceOfferingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/service-offering/station-owner")
public class StationServiceOfferingController {
    private final ServiceOfferingService serviceOfferingService;

    @PostMapping
    public ResponseEntity<ServiceOffering> createService(
            @RequestBody ServiceDTO serviceDTO
            ){
        StationDTO stationDTO = new StationDTO();
        stationDTO.setId(1L);

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(serviceDTO.getCategory());

        ServiceOffering serviceOfferings = serviceOfferingService
                .createService(stationDTO,serviceDTO,categoryDTO);

        return  ResponseEntity.ok(serviceOfferings);
    }

    @PutMapping
    public ResponseEntity<ServiceOffering> updateService(
            @PathVariable Long id,
            @RequestBody ServiceOffering serviceOffering
    ) throws Exception {

        ServiceOffering serviceOfferings = serviceOfferingService
                .updateService(id,serviceOffering);

        return  ResponseEntity.ok(serviceOfferings);
    }
}
