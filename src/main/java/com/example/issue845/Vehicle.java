package com.example.issue845;


import com.example.issue845.enums.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
//@EntityListeners(VehiclePrefillListener.class)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Vehicle {

    //todo - why is there a mix of private and protected properties???? Code smell....
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    protected String id;
    
    //@JsonUnwrapped //This will flatten the properties on the wire so no API change needed
    //protected VehicleModel vehicleModel;
    
    // START STATIC VEHICLE MODEL INFO, MAY REFACTOR INTO SEPARATE EMBEDDEABLE LATER
    
    protected String airbagType; // ITC - airBags
	//REVISIT: Make sure that this intended to be a boolean
	protected Boolean antilockBrakes; // ITC - antiLock
	protected String antiTheftDeviceCode; // ITC - antiTheft
	protected BodyTypeCode bodyType; // ITC - bodyType
    private String bodyStyleCode; //Confianza Body Style Code
	protected Double costNew; // ITC - msrp
	protected Boolean daytimeRunningLights;
	protected String engineFuel; // ITC - fuelType
	protected EngineType engineType; // ITC - fuelType
	
	protected Boolean fourWheelDrive; // ITC - fourWheelDrive
	protected String make; // ITC - maker
	protected String model; // ITC - model
    protected int numCylinders; // ITC - numOfCyl
    protected String performanceCode;
    protected SeatBeltType seatBeltType; //ITC - passSeatRestraint
    protected String trim;
    protected Integer weight;
    protected Integer year; //ITC - year
    
    // ITC - New values available from ITC dataservices if we start using them
    private boolean convertible; 
    private boolean frontWD;
    private boolean hatchback;
    private Integer modelCode;
	private Integer modelGroupCode;
	private Integer numOfDoors;
	private TruckSizeCode truckSize;
	private boolean turbo;
	private Integer uniqueSymCode;
	private VehicleTypeCode vehicleCode;
	private VehicleTypeType garageAssetType;
    
	// END STATIC VEHICLE MODEL INFO
    
    //@NotNull need this to be not null for Acord/ITC calls
    protected String vin;
    protected String photoLocation;
    protected VehicleOwnershipType ownershipStatus;
    protected Integer deductible;
    protected VehicleUseType use;
    protected Integer commuteMiles;
    protected Integer dailyMiles;
    protected Integer annualMiles;
    protected Boolean rideShare;
    protected Boolean vehicleShare;
    protected Integer odometer;
    protected String commuteDays;
   
    //REVISIT:  should be covered by ownership status no?
    protected Boolean leased;
    //salvaged
    protected Boolean brandedTitle;
    protected Boolean existingDamage;

    //TODO:  make enum of S and G (what do S and G stand for?
    protected GaragingCodeType garagingCode;

    @Embedded
    protected Address garagingAddress;
    
    protected LocalDate registrationDate;
    protected LocalDate purchaseDate;
    protected String registrationState;
    protected String plateType;
    @Size(max=8)
    protected String plateNumber;
    protected LocalDate odometerReadingDate;

    protected String lienholderName;
    protected String lienholderStreet1;
    protected String lienholderStreet2;
    protected String lienholderCity;
    protected String lienholderState;
    protected String lienholderPostalCode;
    
    protected boolean nonOwned;

    @OneToOne
    @ToString.Exclude
    protected Driver primaryDriver;

    private PrefillStatusType prefillStatus;

    @ManyToOne
    @NotNull
    @ToString.Exclude
    protected Household household;
    
    @OneToMany
    protected List<VehicleImage> vehicleImages;

    @OneToMany
    protected List<VehicleDocument> vehicleDocuments;

    @OneToMany(cascade= CascadeType.ALL, mappedBy="vehicle")
    protected List<VehicleMaintenanceRecord> vehicleMaintenanceRecords;

}
