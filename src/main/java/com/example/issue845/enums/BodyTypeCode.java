package com.example.issue845.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ACORD VehBodyTypeCd values
 * @author barrett
 *
 */
public enum BodyTypeCode {
	_2D("Two Door Sedan","2D"),
	_2DRHT("Two Door Hardtop","2DRHT"),
	_2H("Two Door Hatchback","2H"),
	_2L("Two Door Liftback","2L"),
	_2W("Two Door Wagon","2W"),
	_3C("3 Door Extended Cab/Chassis","3C"),
	_4C("4 Door Extended Cab/Chassis","4C"),
	_4DRHT("Four Door Hardtop","4DRHT"),
	_4H("Four Door Hatchback","4H"),
	_4L("Four Door Liftback","4L"),
	_4W("Four Door Wagon","4W"),
	_4WD("Four-Wheel Drive","4WD"),
	_5D("Five Door Sedan","5D"),
	AA("Antique Auto","AA"),
	AM("Amphibious Auto","AM"),
	AMB("Ambulance","AMB"),
	AMBE("Ambulance (emergency)","AMBE"),
	AMBNE("Ambulance (non emergency)","AMBNE"),
	AMC("Antique Motorcycle","AMC"),
	ARPTL("Airport Limousine","ARPTL"),
	ATV("All Terrain Vehicle","ATV"),
	BUS("Bus","BUS"),
	BUSARP("Airport Bus","BUSARP"),
	BUSCHR("Church Bus","BUSCHR"),
	BUSICTY("Inter City Bus","BUSICTY"),
	BUSOTH("Buses Otherwise Not Classified","BUSOTH"),
	BUSPPIL("Private Passenger Rated from CLM, Business Use","BUSPPIL"),
	BUSPSP("School Bus Owned by Political Subdivision or School District","BUSPSP"),
	BUSSSE("Sightseeing Bus","BUSSSE"),
	BUSURB("Urban Bus","BUSURB"),
	CB("Detachable Camper Body","CB"),
	CC("Compact Car","CC"),
	CDS("Driver Training - Commercial","CDS"),
	CDSDC("Commercial Driving School with Dual Controls","CDSDC"),
	CDSW("Commercial Driving School without Dual Controls","CDSW"),
	CHRTB("Charter Bus","CHRTB"),
	CL("Classic Auto","CL"),
	CONVT("Convertible","CONVT"),
	COSUV("Compact SUV","COSUV"),
	COUPE("Coupe","COUPE"),
	CRSUV("Crossover SUV","CRSUV"),
	CT("Camper Trailer","CT"),
	DB("Dune Buggy","DB"),
	DMPST("Dump Semi-Trailer","DMPST"),
	DMPT("Dump Trailer","DMPT"),
	EA("Electric Auto","EA"),
	FDNP("Fire Departments (non-private passenger type)","FDNP"),
	FDP("Fire Departments (private passenger type)","FDP"),
	FNRE("Funeral (combination Hearse-Ambulance, Emergency)","FNRE"),
	FNRFC("Funeral Flower Car","FNRFC"),
	FNRH("Funeral Hearse","FNRH"),
	FNRL("Funeral Limousine","FNRL"),
	FNRN("Funeral (combination Hearse-Ambulance, non-Emergency)","FNRN"),
	FPCPR("Folding or Pop-up Campers","FPCPR"),
	GC("Golf Cart","GC"),
	GO("Go Cart","GO"),
	GOLFM("Golfmobile","GOLFM"),
	GRMNT("Ground Maintenance Vehicle","GRMNT"),
	HATCH("Hatch Back","HATCH"),
	HDTOP("Hardtop","HDTOP"),
	HYSUV("Hybrid SUV","HYSUV"),
	LEAM("Law Enforcement Agency (Motorcycle)","LEAM"),
	LEAP("Law Enforcement Agency (PPT)","LEAP"),
	LENN("Law Enforcement Agency (non-PPT, non-Motorcycle)","LENN"),
	LFSUV("Large/Full-size SUV","LFSUV"),
	LL("Suburban or Carry All","LL"),
	LM("Limousine","LM"),
	LXSUV("Luxury SUV","LXSUV"),
	MB("Motorbike","MB"),
	MC("Motorcycle","MC"),
	MH("Motor Home","MH"),
	MISUV("Mini SUV","MISUV"),
	MNS("Minibike","MNS"),
	MOBAV("Mobility Assistance Vehicle","MOBAV"),
	MOBL22("Mobile Home Trailer Less than 22 feet","MOBL22"),
	MOBO22("Mobile Home Trailer Over 22 feet","MOBO22"),
	MOBOT("Mobile Home Trailer Other","MOBOT"),
	MOBUN("Mobile Home Trailer Unspecified","MOBUN"),
	MP("Moped","MP"),
	MS("Motor Scooter","MS"),
	MSSUV("Mid-size SUV","MSSUV"),
	OMC("Other Motorized Cycles","OMC"),
	ORSUV("Off-road SUV","ORSUV"),
	OT("Other","OT"),
	Othsb("Other School Bus","Othsb"),
	PP("Private Passenger Automobile Make","PP"),
	PPIL("Private Passenger Rated from CLM, Pleasure Use (Illinois Only)","PPIL"),
	PPRC("Private Passenger Rated from CLM","PPRC"),
	PPRCF("Private Passenger Rated from CLM (Farm)","PPRCF"),
	PU("Pickup Truck","PU"),
	PUCM("Pickup with Camper Body","PUCM"),
	PVNOC("Public Vehicle Not Otherwise Classified","PVNOC"),
	RT("Recreational Trailer","RT"),
	RV("Recreational Vehicle","RV"),
	SC("Sport Coupe","SC"),
	SD("Sedan Delivery or Panel Truck","SD"),
	SDS("School Driver Training","SDS"),
	SDSD("School Driver Training with Dual Controls","SDSD"),
	SDSW("School Driver Training without Dual Controls","SDSW"),
	SEDAN("Sedan","SEDAN"),
	SHRMT("Showroom Trailer","SHRMT"),
	SMEF("Special or Mobile Equipment (Farm)","SMEF"),
	SMEN("Special or Mobile Equipment (non-Farm)","SMEN"),
	SMH22("Self-Propelled Motor Home - Up to 22 feet","SMH22"),
	SMHO22("Self-Propelled Motor Home - Over 22 feet","SMHO22"),
	SNOWM("Snowmobile","SNOWM"),
	SRVT("Service or Utility Trailer","SRVT"),
	SSEMP("Social Services Auto (Employee Operated)","SSEMP"),
	SSOTH("Social Services Auto (all other)","SSOTH"),
	ST("Semi-Trailer","ST"),
	STWAG("Station Wagon","STWAG"),
	SUV("Sport Utility Vehicle","SUV"),
	TAXI("Taxi","TAXI"),
	TB("Trail Bike","TB"),
	TCDSD("Commercial Driving School with Dual Controls (Trucks-Tractors-Trailers)","TCDSD"),
	TCDSW("Commercial Driving School without Dual Controls (Trucks-Tractors-Trailers)","TCDSW"),
	TR("Trailer","TR"),
	TRAE("Transportation of Athletes and Entertainers","TRAE"),
	TREMO("Transportation of Employees (all other)","TREMO"),
	TREMP("Transportation of Employees (PPT)","TREMP"),
	TRSUV("Truck-like SUV","TRSUV"),
	TRUCKD("Dump Truck","TRUCKD"),
	TRUCKT("Truck","TRUCKT"),
	TRUCKTKTR("Truck-Tractor","TRUCKTKTR"),
	UT("Utility Trailer","UT"),
	VAN("Van","VAN"),
	VAN8V("Eight Passenger Sport Van","VAN8V"),
	VANCRG("Cargo Van","VANCRG"),
	VANEC("Extended Cargo Van","VANEC"),
	VANES("Extended Sport Van","VANES"),
	VANEW("Extended Window Van","VANEW"),
	VANMV("Mini Van","VANMV"),
	VANPAN("Panel Van","VANPAN"),
	VANPE("Van Pools (Employer Furnished)","VANPE"),
	VANPO("Van Pools (All Other)","VANPO"),
	VANSTP("Step Van","VANSTP"),
	VANSV("Sport Van","VANSV"),
	VANUTIL("Utility Van","VANUTIL"),
	VANVC("Van Camper","VANVC"),
	VANWD("Window Van","VANWD")
	;
	
	private String description;
	private String codeValue;
	
	BodyTypeCode(String description, String codeValue){
        this.description = description;
        this.codeValue = codeValue;
    }

	@JsonCreator
	public static BodyTypeCode fromString(String codeValue) {
		for (BodyTypeCode type : BodyTypeCode.values()) {
			if (type.codeValue.equalsIgnoreCase(codeValue)) {
				return type;
			}
		}
		return null;
	}
	
	/**
	 * Code value should be the serialization value (when not using jackson, e.g. xml)
	 * @return
	 */
	@JsonValue
	public String getCodeValue(){
        return this.codeValue;
    }
	
    public String getDescription(){
        return this.description;
    }

}
