package com.example.issue845;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
//@EntityListeners(CredentialListener.class)
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Credential {


    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    protected String id;
	
	@OneToOne(optional=false)
	private HouseholdMember householdMember;
	
	@Size(max = 64)
	@Column(unique=true)
	//@NotNull
	private String username;

	@RestResource(exported = false)
	@JsonIgnore()
	private String encryptedPassword;

	@RestResource(exported = false)
	private String password;
	
	@Transient
	private String referrer;


}
