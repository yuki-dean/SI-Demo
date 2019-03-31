package test.model.weatherRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"theCityCode", "theUserId"})
public class GetWeather {

    @XmlElement(namespace = NameSpace.N_URI)
    private String theCityCode;
    @XmlElement(namespace = NameSpace.N_URI)
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
