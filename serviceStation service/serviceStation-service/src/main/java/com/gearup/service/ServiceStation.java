package com.gearup.service;

import com.gearup.model.serviceStation;
import com.gearup.payload.dto.StationDTO;

public interface ServiceStation {
    serviceStation createStation(StationDTO station, userDTO user);

}
