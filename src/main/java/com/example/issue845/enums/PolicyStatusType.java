package com.example.issue845.enums;

public enum PolicyStatusType {
	PENDING("Pending"),
	SUBMITTED("Submitted"),
	ACCEPTED("Accepted"),
	ACTIVE("Active"),
	EXPIRED("Expired")
	;
	private String description;
	PolicyStatusType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
