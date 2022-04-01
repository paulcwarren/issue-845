package com.example.issue845.enums;

public enum VehicleUseType {

    COMMUTE("Commute"), 
    BUSINESS("Business"), 
    PLEASURE("Pleasure");

	private final String description;

	VehicleUseType(String description){
          this.description=description;
      }

  	public String getDescription() {
  		return description;
  	}
}

