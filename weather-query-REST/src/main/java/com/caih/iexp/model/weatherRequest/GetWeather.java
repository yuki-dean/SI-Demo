package com.caih.iexp.model.weatherRequest;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "getWeather", namespace = NameSpace.N_URI)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"theCityCode", "theUserId"})
public class GetWeather {

    @XmlElement(name = "theCityCode", namespace = NameSpace.N_URI)
    private String theCityCode;
    @XmlElement(name = "theUserId", namespace = NameSpace.N_URI)
    private String theUserId;

    public GetWeather() {
    }

    public GetWeather(String theCityCode, String theUserId) {
        this.theCityCode = theCityCode;
        this.theUserId = theUserId;
    }

    public String getTheCityCode() {
        return theCityCode;
    }

    public void setTheCityCode(String theCityCode) {
        this.theCityCode = theCityCode;
    }

    public String getTheUserId() {
        return theUserId;
    }

    public void setTheUserId(String theUserId) {
        this.theUserId = theUserId;
    }
}
