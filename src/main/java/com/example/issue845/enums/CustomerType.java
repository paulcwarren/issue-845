package com.example.issue845.enums;

/**
 * The CustomerType enumeration.
 */
public enum CustomerType {
	NONSTANDARD("Nonstandard"),
	STANDARD("Standard"),
	PREFERRED("Preferred"),
	ECONOMY("Economy"),
    ;
    private final String description;

    CustomerType(String description){
          this.description=description;
      }

  	public String getDescription() {
  		return description;
  	}
}
