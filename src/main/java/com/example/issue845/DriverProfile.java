package com.example.issue845;


import com.example.issue845.enums.*;
import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.time.LocalDate;


@Embeddable
//@Entity
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DriverProfile {
	
	/*
	@Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    protected String id;
	*/

    protected String mobilePhoneNumber;
    protected String email;
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected LocalDate dob;
    protected String licenseId;
    protected LocalDate licenseExpiration;
    protected LocalDate licenseIssue;
    protected String licenseClass;
    protected String licenseState;

    
    @Embedded
    protected Address address;
    
    protected SexType sex;
    protected MaritalStatusType maritalStatus;
    protected HomeOwnershipType homeownership;
    //REVISIT:  this should be derived from currentAddressStart?
    protected Integer currentResidenceYears;
    protected LocalDate currentResidenceStart;
    protected ResidenceType residence;
    //policy owner or named insured
    protected InsuredRoleType insuredRole;
    
    protected Integer yearsEmployed;
    protected Integer yearsAtCurrentOccupation;
    protected OccupationClassCode occupationClassCode;
    protected EducationLevelCode educationLevelCode;
    protected Boolean military;
    
	public String getFullName() {
		StringBuilder sb = new StringBuilder();
		sb.append(firstName);
		sb.append(firstName!=null?" "+middleName:middleName);
		sb.append(firstName!=null||middleName!=null?" "+lastName:lastName);
		return sb.toString();  	
	}
}
