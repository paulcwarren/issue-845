package com.example.issue845.enums;

public enum VehicleServiceType {

	 NEWTIRES("New Tires"),
	 TIREROTATION("Tire Rotation"),
	 ALIGNMENT("Alignment"),
	 FULLSERVICE("Full Service");

	private final String description;

	VehicleServiceType(String description){
		       this.description=description;
		   }

	public String getDescription() {
		return description;
	}

}
