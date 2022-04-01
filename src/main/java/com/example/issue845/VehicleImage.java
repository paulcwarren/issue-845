package com.example.issue845;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString
public class VehicleImage extends Media {

//    @JsonIgnore
//    @ManyToOne
//    @RestResource(exported = false)
//    @ToString.Exclude
//    private Vehicle vehicle;

//    @Enumerated(EnumType.STRING)
//    private VehicleImageAngle vehicleImageAngle;

    private String session;

}

