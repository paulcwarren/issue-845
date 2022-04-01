package com.example.issue845;

import com.example.issue845.enums.DriverRelationshipType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@Getter
@ToString
public class Driver {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    protected String id;

    @Embedded
    protected DriverProfile profile;
    
    @OneToOne
    protected Vehicle primaryVehicle; 
    
    protected DriverRelationshipType relationshipToCustomer;

    @ManyToOne
   // @NotNull
    @ToString.Exclude
    protected Household household;
    
    protected Boolean isEmergencyContact;
    
    protected Boolean externalData;
    protected Boolean invitationCompleted;

    @OneToMany
    protected List<DriverDocument> driverDocuments;

}
