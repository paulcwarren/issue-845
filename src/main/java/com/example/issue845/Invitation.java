package com.example.issue845;

import com.example.issue845.enums.InvitationStatusType;
import com.example.issue845.enums.InvitationType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
//@EntityListeners(InvitationListener.class)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Invitation {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "id", updatable = false, nullable = false, length = 32)
	protected String id;

	private InvitationType invitationType;

	private String campaignCode;

	@ManyToOne
	private Household household;
	
	@ManyToOne
	private Driver driver;

	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String email;

	@Column(unique=true)
	private String inviteCode;

	@CreatedDate
	@Column(updatable = false)
	protected Instant createdDate;

	protected InvitationStatusType status;

	@Override
	public String toString() {
		return "Invitation [id=" + id + ", invitationType=" + invitationType.toString() + ", campaignCode=" + campaignCode
				+ ", household=" + household + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", inviteCode=" + inviteCode + ", createdDate=" + createdDate + ", status=" + status.toString()  +  "]";
	}
	
	
	
	
	
}
