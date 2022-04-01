package com.example.issue845;

import com.example.issue845.enums.PolicyQuestionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Builder//(toBuilder = true)
@AllArgsConstructor
//@NoArgsConstructor
@Setter
@Getter
@Entity
public class PolicyQuestion {

	public PolicyQuestion() {}
	
	@Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    protected String id;
	
	protected PolicyQuestionType questionType;
	protected String text;
	protected boolean driverRequired;
	protected boolean vehicleRequired;
	protected boolean evidenceRequired;
	protected boolean answerRequired;
	protected String evidenceDescription;
	protected String discountAmount;
	
	//Indicates that this is one of the five default questions in the Acord xml for quote request
	/*
	 * 					<PersDriverInfo VehPrincipallyDrivenRef="Veh1">
						<DefensiveDriverCd>N</DefensiveDriverCd>
						<DriverRelationshipToApplicantCd>IN</DriverRelationshipToApplicantCd>
						<DriverTrainingInd>0</DriverTrainingInd>
						<GoodStudentCd>N</GoodStudentCd>
						<MatureDriverInd>N</MatureDriverInd>
					</PersDriverInfo>
					//The three we care about for now are going to be
					 * DriverTrainingInd
					 * GoodStudentCd
					 * 
					 * we can derive MatureDriverIn and DriverRelationshipApplicantCd 
	 */
	
	protected boolean global;
	
	@Column(unique=true)
	protected String questionCode;
	
	//can be empty if the response is free form
	@ElementCollection
	protected List<String> acceptableResponses;
	
	
	//ITC company questions "FieldName" values that map to this PolicyQuestion
	//TODO:  Verify that FieldName is unique across companies.  It appears to be so in the test data
	@ElementCollection
	protected List<String> ITCMappings;

}
