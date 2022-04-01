package com.example.issue845.enums;

public enum ResidenceType {
    APARTMENT("Apartment"), 
    FIRM("Firm"), 
    HIGHRISE("High Rise"),
    MULTIUNIT("Multi Unit"), 
    POBOX("PO Box"),
    RURALROUTE("Rural Route"), 
    STREET("Street"), 
    UNKNOWN("Unknown");

	;
	private String description;
	ResidenceType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

}
