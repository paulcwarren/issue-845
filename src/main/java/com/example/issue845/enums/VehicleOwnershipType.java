package com.example.issue845.enums;

public enum VehicleOwnershipType {

    OWNED("Owned"), 
    LEASED("Leased"), 
    LOANED("Loaned");

	private final String description;

	VehicleOwnershipType(String description){
          this.description=description;
      }

  	public String getDescription() {
  		return description;
  	}
}
