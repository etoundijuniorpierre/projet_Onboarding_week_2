package com.location_service.mapper;


import com.location_service.dto.ReponseDto;
import com.location_service.dto.RequestDto;
import com.location_service.entity.LocationEntity;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperLocation {
     LocationEntity toEntity(RequestDto requestDto);
     ReponseDto toDto(LocationEntity locationEntity);
     List<ReponseDto> toDtoList(List<LocationEntity> locationEntities);
}
