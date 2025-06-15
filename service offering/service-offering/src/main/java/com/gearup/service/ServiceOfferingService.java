package com.gearup.service;

import com.gearup.dto.CategoryDTO;
import com.gearup.dto.ServiceDTO;
import com.gearup.dto.StationDTO;
import com.gearup.model.ServiceOffering;

public interface ServiceOfferingService {
    ServiceOffering createService(StationDTO stationDTO,
                                  ServiceDTO serviceDTO,
                                  CategoryDTO categoryDTO);
}
