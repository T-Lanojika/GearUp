package com.gearup.model;

import lombok.Data;

@Data
public class StationReport {
    private  Long stationId;
    private  String stationName;
    private  Double totalEarnings;
    private  Integer totalBookings;
    private  Integer cancelledBooking;
    private  Double totalRefund;


}
