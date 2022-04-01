package com.example.issue845;

import com.example.issue845.enums.CustomerType;
import com.example.issue845.enums.InvitationType;
import com.example.issue845.enums.PrefillStatusType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * A Household.
 */
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Household implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    protected String id;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_type")
    private CustomerType customerType;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="household")
    private List<Driver> drivers;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy="household")
    private List<HouseholdMember> householdMembers;
    
    @OneToOne
    private HouseholdMember headOfHousehold;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy="household")
    private List<Vehicle> vehicles;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="household")
    @ToString.Exclude
    private List<Invitation> invitations;
    
    @ManyToOne
    private Agent agent;
    
    private String primaryPhoneNumber;
 
    private String agentCode;
    
    private String stripeCustomerId;
    
    private PrefillStatusType prefillStatus;
    
    private Boolean quoteEnabled;

    private InvitationType invitationType;

    private String campaignCode;

    private String prefillProfile;
    
    @Transient
    protected CustomerFitnessValues fitnessValues;
    
    @OneToMany(cascade=CascadeType.ALL)
    private List<Policy> policies;

    private String referrer;

    @Builder.Default
    private Boolean acceptedTerms = false;

    private LocalDate acceptTermsDate;

    public void clearDriver(Driver driver) {
        driver.setHousehold(null);
        if (drivers != null) {
            drivers.remove(driver);
        }
    }

    public void addDriver(Driver driver) {
        if (drivers == null)
        	drivers = new ArrayList<Driver>();
        driver.setHousehold(this);
        drivers.add(driver);
    }

    public void clearHeadHouseholdMember() {
        headOfHousehold = null;
    }

    public void clearHouseholdMember(HouseholdMember householdMember) {
        householdMember.setHousehold(null);
        headOfHousehold = null;
        if (householdMembers != null) {
            householdMembers.remove(householdMember);
        }
    }

    public void addHouseholdMember(HouseholdMember householdMember) {
        if (householdMembers == null)
            householdMembers = new ArrayList<HouseholdMember>();
            householdMember.setHousehold(this);
        householdMembers.add(householdMember);
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles == null)
            vehicles = new ArrayList<Vehicle>();
        vehicle.setHousehold(this);
        vehicles.add(vehicle);
    }
}
