package com.example.issue845;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PUBLIC)
@Getter
@ToString
public class Company {

	@Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    protected String id;
	
	protected String name;
	
    protected ITCCompanyInfo itcCompanyInfo;
    
    protected boolean writesNonStandard;
    protected boolean preferredFocus;
    protected boolean writesSR22;
    protected boolean writesMVROver15;
    protected boolean writesDriverWOVehicle;
    protected boolean writesSalvageTitle;
    protected boolean writesLapseInCoverage;
    protected boolean writesFirstTimeOwner;
    protected boolean writesUnder18;
    protected boolean writesOver80;
    protected boolean writesRideShare;
    protected boolean writesCommuteOver50;
    
}


