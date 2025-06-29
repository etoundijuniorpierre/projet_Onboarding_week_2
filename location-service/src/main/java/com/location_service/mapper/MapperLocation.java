package com.location_service.mapper;


import com.location_service.dto.LocationReponseDto;
import com.location_service.dto.LocationRequestDto;
import com.location_service.entity.LocationEntity;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperLocation {
     LocationEntity toEntity(LocationRequestDto locationRequestDto);
     LocationReponseDto toDto(LocationEntity locationEntity);
     List<LocationReponseDto> toDtoList(List<LocationEntity> locationEntities);
}
