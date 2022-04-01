package com.example.issue845;


import com.example.issue845.enums.PolicyPaymentScheduleType;
import com.example.issue845.enums.PolicyStatusType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PUBLIC)
@Getter
@ToString
public class Policy {

	
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    private String id;

    @NotNull
    //REVISIT:  I don't think we can make this unique across all policies and the constraint will be policy # and company id
    protected String policyNumber;
    protected String itcTransactionId;

    
    protected String stripeChargeId;
    protected String stripeTransactionId;
    protected Date downPaymentDate;
    protected Date effectiveDate;
    protected Date expirationDate;
    
    protected Date bindDate;
    protected Integer totalPremium;
    protected String paymentPlanDescription;
    protected Integer downPayment;
    protected Integer numberOfPayments;
    protected Double paymentAmount;
    protected PolicyPaymentScheduleType paymentSchedule;

    
    //TODO:  Turn into an enum once we have more than one policy type,  right now all are auto
    protected String policyType;
    protected PolicyStatusType status;
    protected boolean prefilled;

    @ManyToOne
    @NotNull
    @ToString.Exclude
    protected Household household;
    
    @ManyToOne
    @NotNull
    protected Company company;
    
    @ManyToOne
    @NotNull
    protected Agent agent;
    
    
    //REVISIT:  This is probably extraneous.  The VehicleCoverages account for all the vehicles on the policy.
    @ManyToMany
    protected List<Vehicle> vehicles;
    
    @ManyToMany
    protected List<Driver> drivers;
    
    @OneToMany
    protected List<VehicleCoverage> coverages;
    //TODO:
    //protected List<> documents;
    
    @OneToOne
    protected VideoAttestation videoAttestation;
    
    @OneToOne
    protected SignatureImage signatureImage;
    
    @OneToMany(cascade = {CascadeType.ALL})
    protected List<PolicyQuestionAnswer> answers;
  
    
}
