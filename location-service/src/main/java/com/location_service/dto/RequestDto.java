package com.location_service.dto;


import lombok.Data;



@Data
public class RequestDto {
    private String id;
    private String city;
    private String zone;
    private boolean checkpointAvailable;
}
