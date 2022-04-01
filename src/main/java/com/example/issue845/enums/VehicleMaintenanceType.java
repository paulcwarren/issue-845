package com.example.issue845.enums;

public enum VehicleMaintenanceType {

    OILCHANGE("Oil Change"),
    TIRES("Tires"),
    BRAKES("Brakes"),
    SERVICE("General Service"),
    EMISSIONS("Emissions"),
    BODYWORK("Body Work");

    private final String description;

    VehicleMaintenanceType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
