package com.example.issue845;

import javax.persistence.Entity;

//import com.insurescan.quoteservice.household.model.VehicleMaintenanceRecord;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class MaintenanceEvidence extends Media {

//    @JsonIgnore
//    @ManyToOne
//    @RestResource(exported = false)
//    private VehicleMaintenanceRecord maintenanceRecord;

}
