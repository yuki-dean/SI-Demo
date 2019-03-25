package com.caih.iexp.model;


public class CityCode {
    private String theCityCode;
    private String theUserId;

    public CityCode() {
    }

    public CityCode(String theCityCode, String theUserId){
        this.theCityCode = theCityCode;
        this.theUserId = theUserId;
    }

    public String getTheCityCode() {
        return theCityCode;
    }

    public String getTheUserId() {
        return theUserId;
    }

    @Override
    public String toString() {
        return "theCityCode:" + theCityCode + "," + "theUserId:" + theUserId;
    }
}
