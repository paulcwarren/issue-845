package com.example.issue845;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
public class VehiclePolicyError {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false, length=32)
    protected String id;
	protected double amount;
	protected String text;
	protected double percentage;
	protected String scopeName;
	protected int scopeValue;
	
	@ManyToOne
	protected Vehicle vehicle;

	//For the projection
	public String getVehicleId() {
		if(vehicle != null) {
			return vehicle.getId();
		}
		else {
			return null;
		}
	}

}
