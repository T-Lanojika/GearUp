package com.gearup.controller;

import com.gearup.model.ServiceOffering;
import com.gearup.service.ServiceOfferingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/service-offering")
public class ServiceOfferingController {

    private ServiceOfferingService serviceOfferingService;

    @GetMapping("/station/{stationId}")
    public ResponseEntity<Set<ServiceOffering>> getServiceByStationId(
            @PathVariable Long stationId,
            @RequestParam(required = false) Long categoryId
    ){
        Set<ServiceOffering> serviceOfferings = serviceOfferingService
                .getAllServiceByStationId(stationId,categoryId);
        return  ResponseEntity.ok(serviceOfferings);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceOffering> getServiceById(
            @PathVariable Long id

    ) throws Exception {
        ServiceOffering serviceOffering = serviceOfferingService
                .getServiceById(id);
        return  ResponseEntity.ok(serviceOffering);
    }

    @GetMapping("/list/{ids}")
    public ResponseEntity<Set<ServiceOffering>> getServicesByIds(
            @PathVariable Set<Long> ids

    ){
        Set<ServiceOffering> serviceOfferings=serviceOfferingService
                .getServicesByIds(ids);
        return  ResponseEntity.ok(serviceOfferings);
    }
}
