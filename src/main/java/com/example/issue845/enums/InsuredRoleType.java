package com.example.issue845.enums;

public enum InsuredRoleType {
	OWNER("Owner"),
	NAMED("Named insured")
	;
	private String description;
	InsuredRoleType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

}
