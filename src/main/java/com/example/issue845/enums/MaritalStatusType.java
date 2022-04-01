package com.example.issue845.enums;

public enum  MaritalStatusType {
    MARRIED("Married", "M"), 
    SINGLE("Single", "S"), 
    DIVORCED("Divorced", "D"),
    WIDOWED("Widowed", "W"), 
    UNKNOWN("Unknown", "U")
    ;
    private final String description;
    private final String singleCode;
    MaritalStatusType(String description, String singleCode){
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
