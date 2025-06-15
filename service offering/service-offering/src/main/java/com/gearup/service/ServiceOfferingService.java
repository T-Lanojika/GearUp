package com.gearup.service;

import com.gearup.dto.CategoryDTO;
import com.gearup.dto.ServiceDTO;
import com.gearup.dto.StationDTO;
import com.gearup.model.ServiceOffering;

import java.util.Set;

public interface ServiceOfferingService {
    ServiceOffering createService(StationDTO stationDTO,
                                  ServiceDTO serviceDTO,
                                  CategoryDTO categoryDTO);

    ServiceOffering updateService(Long serviceId,ServiceOffering service) throws Exception;

    Set<ServiceOffering> getAllServiceByStationId(Long stationId, Long categoryId);

    Set<ServiceOffering> getServiceById(Set<Long> ids);

    ServiceOffering getServiceById(Long id) throws Exception;
}
