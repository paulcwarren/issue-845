package com.example.issue845.enums;

public enum EngineType {
    HYBRID("Hybrid"),
    CNG("CNG"), 
    DIESEL_TURBO("Diesel Turbo"), 
    DIESEL("Diesel"), 
    GAS_TURBO("Turbo"), 
    GAS("Gas");
	;
    private final String description;

    EngineType(String description){
          this.description=description;
      }

  	public String getDescription() {
  		return description;
  	}
}
