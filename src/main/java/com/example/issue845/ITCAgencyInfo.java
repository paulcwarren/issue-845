package com.example.issue845;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ITCAgencyInfo {
	
	//This field is the primary key for the agent turborater set up in ITC, and is used as the basic username and pwd value for DataServices requests
	protected String accountId;
	
	//These are needed for all the Rate Enginge API calls
	protected String accountNumber;
	protected String accountName;
	protected String accessId;
	
	//This is used just in the rate engine rate request API call
	protected String realTimeAccountNumber;
	
	//This is used just on the rate engine get CompanyInfo calls
	protected String agencyId;
}
