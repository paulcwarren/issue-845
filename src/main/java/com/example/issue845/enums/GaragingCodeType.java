package com.example.issue845.enums;

public enum GaragingCodeType {
	STREET("Street"),
	GARAGE("Garage");

	private String description;
	GaragingCodeType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

}
