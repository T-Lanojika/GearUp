package com.gearup.payload.response.dto;

import lombok.Data;

@Data
public class ServiceDTO {
    private Long id;

    private String name;

    private String description;

    private int price;

    private int duration;

    private Long stationId;

    private Long category;

    private String image;
}
