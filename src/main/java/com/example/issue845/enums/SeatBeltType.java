package com.example.issue845.enums;

public enum SeatBeltType {
	ACTIVE("active"), 
	NONE("none"), 
	PASSIVEBOTH("passive for both seats"), 
	PASSIVEDRIVER("Passive for driver seat"),
	SEATAIR("Seat belts and/or airbags");
	
	;
	private String description;
	SeatBeltType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

}
