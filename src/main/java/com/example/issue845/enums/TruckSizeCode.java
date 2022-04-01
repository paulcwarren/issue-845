package com.example.issue845.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by jt on 4/1/22.
 */
public enum TruckSizeCode {
    _1("Quarter Ton","1"),
    _2("Half Ton","2"),
    _3("Three Quarter Ton","3"),
    _F("One Ton","F"),
    _O("Over One Ton","O")
    ;
    private String description;
    private String codeValue;
    TruckSizeCode(String description, String codeValue){
        this.description = description;
        this.codeValue = codeValue;
    }

    @JsonCreator
    public static TruckSizeCode fromString(String codeValue) {
        for (TruckSizeCode type : TruckSizeCode.values()) {
            if (type.codeValue.equalsIgnoreCase(codeValue)) {
                return type;
            }
        }
        return null;
    }

    /**
     * Code value should be the serialization value (when not using jackson, e.g. xml)
     * @return
     */
    @JsonValue()
    public String getCodeValue(){
        return this.codeValue;
    }
    public String getDescription(){
        return this.description;
    }
}
