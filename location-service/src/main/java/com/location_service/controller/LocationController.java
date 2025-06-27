package com.location_service.controller;

import com.location_service.dto.ReponseDto;
import com.location_service.dto.RequestDto;
import com.location_service.entity.LocationEntity;
import com.location_service.mapper.MapperLocation;
import com.location_service.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/location")
public class LocationController {

    private final LocationService locationService;
    private final MapperLocation mapperLocation;

    public LocationController(LocationService locationService, MapperLocation mapperLocation) {
        this.locationService = locationService;
        this.mapperLocation = mapperLocation;
    }

    @PostMapping
    public ResponseEntity<ReponseDto> addLocation(@RequestBody RequestDto requestDto) {
        LocationEntity locationEntity = mapperLocation.toEntity(requestDto);
        LocationEntity createdLocation = locationService.addLocation(locationEntity);
        ReponseDto responseDto = mapperLocation.toDto(createdLocation);
        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    private ResponseEntity<List<ReponseDto>> getAllLocations() {
        List<LocationEntity> allLocations = locationService.getAllLocations();
        return ResponseEntity.ok(mapperLocation.toDtoList(allLocations));
    }

    @GetMapping("/{id}")
    private ResponseEntity<ReponseDto> getLocationById(@PathVariable String id) {
        LocationEntity searchLocation = locationService.getLocationById(id);
        return ResponseEntity.ok(mapperLocation.toDto(searchLocation));
    }
}
