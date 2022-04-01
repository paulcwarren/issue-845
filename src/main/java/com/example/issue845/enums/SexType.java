package com.example.issue845.enums;

public enum SexType {
    MALE("Male","M"), 
    FEMALE("Female","F"), 
    UNKNOWN("Unknown","U");

	private final String description;

	private final String singleCode;
	SexType(String description, String singleCode){
        this.description=description;
        this.singleCode = singleCode;
    }

	public String getDescription() {
		return description;
	}
	public String getSingleCode() {
		return singleCode;
	}

}
