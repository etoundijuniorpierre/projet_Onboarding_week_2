package com.location_service.dto;


import lombok.Data;
import lombok.ToString;


@Data

public class LocationRequestDto {
    private String id;
    private String city;
    private String zone;
    private boolean checkpointAvailable;
}
