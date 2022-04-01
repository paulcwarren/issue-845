package com.example.issue845;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Data
public class Address {
	protected String street1;
	protected String street2;
	protected String city;
	protected String state;
	protected String postalCode;
	protected String country;
	protected String county;
	

}
