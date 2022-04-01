package com.example.issue845.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CoverageCode {
	//Most of the extensions are due to the enum values from ITC having "-"
	ADB("Accidental Death Benefit","ADB"),
	ADDA("Death indemnity","ADDA"),
	ADDG("Total disability","ADDG"),
	APIP("Additional PIP","APIP"),
	AV("Custom Audio/Visual Equipment","AV"),
	BI("Liability BI","BI"),
	CFFEB("Combined First Party Benefits","CFFEB"),
	COLL("Collision","COLL"),
	COMP("Comprehensive","COMP"),
	CWAIV("Collision Deductible Waiver","CWAIV"),
	EXMED("Extra Medical","EXMED"),
	FEB("Funeral benefits","FEB"),
	FG("Full Glass, or Safety Glass, or Full Safety Glass","FG"),
	FPB("'First Party Benefits' not associated with accidental death or funeral. Note that this is also Income Loss coverage in VA.","FPB"),
	FT("Full Tort","FT"),
	GAP("Lease/Loan Gap Coverage","GAP"),
	LCOL("Limited Collision","LCOL"),
	LPD("Limited PD","LPD"),
	MEDPM("Medical Payments","MEDPM"),
	OPTBI("Optional BI","OPTBI"),
	PD("Liability PD","PD"),
	PIP("Personal Injury Protection","PIP"),
	PIP_DI("Household Yes or No","PIP-DI"),
	PIP_EI("Full/Family exclusion","PIP-EI"),
	PIP_G("Guest PIP","PIP-G"),
	PIP_MEDEX("Coordinated Medical Expense","PIP-MEDEX"),
	PIP_OBEL("Optional Basic Economic Loss","PIP-OBEL"),
	PIP_P("Primary insurance covers auto accident expenses, yes/no","PIP-P"),
	PIP_PPO("Personal Injury Protection, PPO","PIP-PPO"),
	PIP_VT("Verbal Lawsuit Threshold NJ PIP option","PIP-VT"),
	PIP_W("Wage/Work Loss Exclusion","PIP-W"),
	RREIM("Rental Reimbursement","RREIM"),
	TL("Towing and Labor","TL"),
	UM("Uninsured Motorists BI","UM"),
	UMPD("Uninsured Motorists PD","UMPD"),
	UNDPD("Underinsured Motorists PD","UNDPD"),
	UNDUM("Underinsured Motorists BI","UNDUM"),
	WLB("Work Loss Benefits","WLB"),
	;

	private String description;
	private String codeValue;
	CoverageCode(String description, String codeValue){
        this.description = description;
        this.codeValue = codeValue;
    }
	
	@JsonCreator
	public static CoverageCode fromString(String codeValue) {
		for (CoverageCode type : CoverageCode.values()) {
			if (type.codeValue.equalsIgnoreCase(codeValue)) {
				return type;
			}
		}
		return null;
	}
	
	/**
	 * Code value should be the serialization value (when not using jackson, e.g. xml)
	 * @return
	 */
	@JsonValue
	public String getCodeValue(){
        return this.codeValue;
    }
    public String getDescription(){
        return this.description;
    }
}
