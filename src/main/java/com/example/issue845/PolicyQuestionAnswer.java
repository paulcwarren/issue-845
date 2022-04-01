package com.example.issue845;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Builder//(toBuilder = true)
@AllArgsConstructor
//@NoArgsConstructor
@Setter
@Getter
@Entity
public class PolicyQuestionAnswer {
	
	public PolicyQuestionAnswer() {}
	
	@Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    protected String id;
	
	@ManyToOne
	protected PolicyQuestion baseQuestion;
	
	protected String answer;
	
	@ManyToOne
	@NotNull
	protected PolicyQuote policyQuote;
	
	@ManyToOne
	protected Driver driver;
	@ManyToOne
	protected Vehicle vehicle;
	@ManyToOne
	protected QuestionEvidence evidence;
	
}
