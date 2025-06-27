package com.location_service.entity;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data

@Document(collection = "tests")
public class LocationEntity {
    @Id
    private String id ;

    private String city;

    private String zone;

    private boolean checkpointAvailable;

}
