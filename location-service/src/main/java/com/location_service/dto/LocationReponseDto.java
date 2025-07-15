package com.location_service.dto;

import com.location_service.dto.microServiceDto.PackageReponseDto;
import lombok.Data;


@Data
public class LocationReponseDto {
    private String id;
    private String city;
    private String zone;
    private PackageReponseDto packages;
    private boolean checkpointAvailable;
}
