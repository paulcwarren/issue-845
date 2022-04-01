package com.example.issue845;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import com.insurescan.quoteservice.household.model.Driver;
//import com.insurescan.quoteservice.household.model.enums.DriverDocumentType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.data.rest.core.annotation.RestResource;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class DriverDocument extends Media {

    @JsonIgnore
    @ManyToOne
    @RestResource(exported = false)
    @ToString.Exclude
    private DriverDocument driver;

    @Enumerated(EnumType.STRING)
    private DriverDocumentType documentType;

    protected String reference;

    public enum DriverDocumentType {FULL_TIME, PART_TIME, CONTRACT}

}
