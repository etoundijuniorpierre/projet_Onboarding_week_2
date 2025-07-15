package com.location_service.feign;


import com.location_service.dto.microServiceDto.PackageReponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "package-service", url = "http://localhost:8083/api/package")
public interface PackageClient {
    @GetMapping("/{id}")
    ResponseEntity<PackageReponseDto> getById(@PathVariable Long id);
}
