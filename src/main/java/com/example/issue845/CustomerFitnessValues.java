package com.example.issue845;

import com.example.issue845.enums.CustomerType;
import lombok.ToString;

/**
 * Created by jt on 4/1/22.
 */
@ToString
public class CustomerFitnessValues {
    public int totalVehicleValue = 0;
    public Boolean homeOwner = false;
    public Boolean highRiskDrivers = false;
    public Boolean coverageLapse = false;
    public Boolean under18 = false;
    public Boolean over80 = false;
    public Boolean vehicleOver15Years = false;
    public Boolean highRiskVehicles = false;
    public Boolean hasNoVehicles = false;
    public Boolean oneVehicleWithMoreThanTwoDrivers = false;
    public Boolean totalVehicleValueUnder15 = false;
    public Boolean totalVehicleValueOver40 = false;
    public Boolean oneVehicleWithTwoDriversExactly = false;
    public CustomerType customerType = null;
}
