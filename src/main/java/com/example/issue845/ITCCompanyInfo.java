package com.example.issue845;

import lombok.*;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ITCCompanyInfo {

	//These come from the ITC getCompanyInfo rate engine call
	@NotNull
    private Long companyID;

	@NotNull
    private Integer programID;

	@NotNull
    private Integer dosCompanyID;
	
	@NotNull
	private String stateCode;
 
	//creditRequired comes from the ITC Get Company info call, but not sure if it the same as the directive orderCreditScore
	//creditRequired is not read by the rate engine only orderCreditScore
    private boolean creditRequired;
    private boolean orderCreditScore;

    //Not sure where these come from , might be manual entry, needed for Rate engine CarrierInfo
    private String carrierID;

    private String carrierPassword;

    private String producerCode;

    private String subProducerCode;

    private BigDecimal agencyFee;
    
}
