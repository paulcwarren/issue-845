package com.example.issue845;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
//@EntityListeners(AgentListener.class)
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PUBLIC)
@Getter
@ToString
public class Agent {

	@Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    protected String id;
	
	protected String firstName;
	protected String lastName;
	protected String phoneNumber;
	protected String email;
	protected String url;
	protected String insurescanUrl;
	@Column(unique=true)
	protected String agencyName;
	protected String logoUrl;
	protected String agentPhotoUrl;
	
    @OneToOne
    protected SignatureImage signatureImage;
	
	public String getFullName() {
		StringBuilder sb = new StringBuilder();
		sb.append(firstName);
		sb.append(firstName!=null?" "+lastName:lastName);
		return sb.toString();  	
	}
	 
	@Embedded
	protected ITCAgencyInfo itcAgencyInfo;
	
	@OneToMany(mappedBy="agent")
	@ToString.Exclude
	protected List<Household> households;
	
	@Embedded
	protected Address address;
	

	@ManyToMany
	protected List<Company> companies;
	
}
