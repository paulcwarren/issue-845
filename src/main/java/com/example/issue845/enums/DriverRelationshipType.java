package com.example.issue845.enums;

public enum DriverRelationshipType {
	WIFE("Wife"),
	DAUGHTER("Daughter"),
	SISTER("Sister"),
	MOTHER("Mother"),
	HUSBAND("Husband"),
	SON("Son"),
	BROTHER("Brother"),
	FATHER("Father"),
	UNKNOWN("Unknown"),
	OTHER("Other")
	;
    private final String description;

    DriverRelationshipType(String description){
          this.description=description;
      }

  	public String getDescription() {
  		return description;
  	}
}
