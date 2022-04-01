package com.example.issue845;


import com.example.issue845.enums.VehicleMaintenanceType;
import com.example.issue845.enums.VehicleServiceType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class VehicleMaintenanceRecord {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "id", updatable = false, nullable = false, length = 32)
	private String id;

	protected String session;
	
	@ManyToOne
	@NotNull
	@ToString.Exclude
	private Vehicle vehicle;

	@Enumerated(EnumType.STRING)
	private VehicleMaintenanceType maintenanceType;

	@Enumerated(EnumType.STRING)
	private VehicleServiceType serviceType;

	protected String companyName;
	protected String description;
	protected Double price;
	protected LocalDate completionDate;
	protected Integer mileage;

	@OneToMany
	protected List<MaintenanceEvidence> maintenanceEvidences;
	


}
