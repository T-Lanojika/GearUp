package com.gearup.service.impl;

import com.gearup.dto.CategoryDTO;
import com.gearup.dto.ServiceDTO;
import com.gearup.dto.StationDTO;
import com.gearup.model.ServiceOffering;
import com.gearup.repository.ServiceOfferingRepository;
import com.gearup.service.ServiceOfferingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class ServiceOfferingServiceImpl implements ServiceOfferingService {

    private final ServiceOfferingRepository serviceOfferingRepository;

    @Override
    public ServiceOffering createService(StationDTO stationDTO, ServiceDTO serviceDTO, CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public ServiceOffering updateService(Long serviceId, ServiceOffering service) {
        return null;
    }

    @Override
    public Set<ServiceOffering> getAllServiceByStationId(Long stationId, Long categoryId) {
        return Set.of();
    }

    @Override
    public Set<ServiceOffering> getServiceById(Set<Long> ids) {
        return Set.of();
    }
}
