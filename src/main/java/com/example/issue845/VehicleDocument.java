package com.example.issue845;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class VehicleDocument extends Media {

//    @JsonIgnore
//    @ManyToOne
//    @RestResource(exported = false)
//    private Vehicle vehicle;

//    @Enumerated(EnumType.STRING)
//    private VehicleDocumentType documentType;

    protected LocalDate startDate;
    protected LocalDate endDate;
//    protected Address address;

}

