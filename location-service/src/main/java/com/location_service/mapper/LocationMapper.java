package com.location_service.mapper;

import com.location_service.dto.LocationReponseDto;
import com.location_service.dto.LocationRequestDto;
import com.location_service.dto.microServiceDto.PackageReponseDto;
import com.location_service.entity.LocationEntity;
import com.location_service.feign.PackageClient;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class LocationMapper {

     @Autowired
     private PackageClient packageClient;


     @Mapping(target = "packageId", source = "packageId")
     public abstract LocationEntity toEntity(LocationRequestDto locationRequestDto);


     @Mapping(target = "packages", source = "packageId")
     public abstract LocationReponseDto toDto(LocationEntity locationEntity);


     public abstract List<LocationReponseDto> toDtoList(List<LocationEntity> locationEntities);


     @Named("packageLocation")
     PackageReponseDto packageLocation(Long id) {
          if (id == null) {
               return null; // or return a default PackageReponseDto
          }
          return packageClient.getById(id).getBody();
     }
}


