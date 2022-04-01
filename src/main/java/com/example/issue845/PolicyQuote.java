package com.example.issue845;


import com.example.issue845.enums.PolicyQuoteGroupingType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PolicyQuote {
	
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    protected String id;

    protected PolicyQuoteGroupingType grouping;
    
    @ManyToOne
    @NotNull
    protected Household household;
    
    @ManyToMany
    protected List<Driver> drivers;
    
    @ManyToMany
    protected List<Vehicle> vehicles;
    
    //Itc transaction id
    protected String transactionId;
    
    protected String phoneCode;
    protected String buyNowUrl;
    protected String contactUrl;
    protected String logoUrl;
    protected String agencyId;
    protected String agencyName;
    protected String agencyAddress1;
    protected String agencyAddress2;
    protected String agencyCity;
    protected String agencyState;
    protected String agencyPostalCode;
    protected String agencyPhone;
    protected String agencyMarketingLine;
    protected boolean ratingComplete;
    
    @ElementCollection(targetClass=SummaryItem.class)
    List<SummaryItem> summaryItems; // can be only up to 4 for some reason, but i don't think we need to enforce that.
    
    protected String ITCCompanyId;
    protected String ITCCompanyName;
    //REVISIT: Can we be sure these will always be a number format?
    protected String programId;
    protected String programName;
    protected int term;
    protected String tier;
    protected LocalDate effectiveDate;
    protected LocalDate expirationDate;
    protected double policyFee;
    protected double SR22Fee;
    protected double ATPAFee;
    protected double FR44Fee;
    protected double agencyFee;
    protected double totalPremium;
    protected String payPlanDescription;
    protected int payPlanNumberOfPayments;
    protected double payPlanPercentDown;
    protected double payPlanDownPayment;
    protected double payPlanPaymentAmount;
    protected double payPlanServiceFees;
    protected double payPlanTotalAmount;
    protected String thirdPartyTransactionId;
    protected String thirdPartyQuoteURL;

    protected boolean agentApproved;
    protected boolean agentApprovalRequired;
    
    @Enumerated(EnumType.ORDINAL) // TODO-I5: bad practice (and all such usages)
    protected QuoteBindStatusType bindStatus;
    
    
    @ManyToOne
    protected Company company;
    
    @OneToMany( cascade = {CascadeType.ALL})
    protected List<VehicleDiscountOrSurcharge> vehicleDiscountsAndSurcharges;

    @OneToMany( cascade = {CascadeType.ALL})
    protected List<DriverDiscountOrSurcharge> driverDiscountsAndSurcharges;
    
    @OneToMany( cascade = {CascadeType.ALL})
    protected List<VehicleWarning> vehicleWarnings;
    
    @OneToMany( cascade = {CascadeType.ALL})
    protected List<DriverWarning> driverWarnings;

    
    @OneToMany( cascade = {CascadeType.ALL})
    protected List<DriverPolicyError> driverPolicyErrors;
    
    @OneToMany( cascade = {CascadeType.ALL})
    protected List<VehiclePolicyError> vehiclePolicyErrors;
    
    @OneToMany( cascade = {CascadeType.ALL})
    protected List<VehicleCoverage> vehicleCoverages;
    
    @OneToMany(cascade = {CascadeType.ALL})
    protected List<PolicyQuestionAnswer> answers;
}
