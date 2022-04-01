package com.example.issue845;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class HouseholdMember {

	   @Id
	    @GeneratedValue(generator = "system-uuid")
	    @GenericGenerator(name = "system-uuid", strategy = "uuid")
	    @Column(name = "id", updatable = false, nullable = false, length=32)
	    protected String id;
	   
	    @OneToOne
	    private Driver driver;
	    
	    @ManyToOne
		@ToString.Exclude
	    protected Household household;
	    
	    @OneToOne(mappedBy="householdMember")
	    protected Credential credential;

}
