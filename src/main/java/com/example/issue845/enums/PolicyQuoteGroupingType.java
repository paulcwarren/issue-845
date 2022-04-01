package com.example.issue845.enums;

public enum PolicyQuoteGroupingType {
	GOOD("Good"), 
	BETTER("Better"), 
	BEST("Best")
	;
	private String description;
	PolicyQuoteGroupingType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
