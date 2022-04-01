package com.example.issue845.enums;

public enum PolicyPaymentScheduleType {
	MONTHLY("Monthly"),
	BIMONTHLY("Bimonthly"),
	BIANNUAL("Biannual"),
	ANNUAL("Annual"),
	OTHER("Other")
	;
	private String description;
	PolicyPaymentScheduleType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
