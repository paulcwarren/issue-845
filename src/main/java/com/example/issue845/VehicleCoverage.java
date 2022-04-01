package com.example.issue845;

import com.example.issue845.enums.CoverageCode;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PUBLIC)
@Getter
@ToString
public class VehicleCoverage {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    protected String id;
    protected CoverageCode coverageCode;
	protected String coverageName;
	protected Double deductible;
	protected Double premium;
	protected String description;

	protected Integer perPerson;
	protected Integer perAccident;
	protected Integer perOccurrence;
	
	
	//There are only two limits, their meaning varies by coverageCode, e.g. for BI limit1 is PerPerson and limit2 is PerAccident
	//Deprecated
	//TODO:  refactor these out but for now the acordpolicyservice uses them 
	protected Integer limit1;
	protected Integer limit2;
	
	@ManyToOne
	@ToString.Exclude
	protected Vehicle vehicle;
	
	protected Boolean required;
	
	
}
