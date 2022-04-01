package com.example.issue845.enums;

public enum HomeOwnershipType {
    OWNED("Owned"),
    RENTED("Rented"),
    UNKNOWN("Unknown");
	;
	private String description;
	HomeOwnershipType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

}
