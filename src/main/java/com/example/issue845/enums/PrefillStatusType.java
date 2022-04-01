package com.example.issue845.enums;

public enum PrefillStatusType {
	UNAPPROVED("Unapproved"),
	APPROVED("Approved"),
	REQUESTED("Requested"),
	ERROR("Error"),
	SKIPPED("Skipped"),
	COMPLETED("Completed")
	;
	private String description;
	PrefillStatusType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
