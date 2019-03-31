package test.model.weatherRequest;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Body {

    @XmlElement(name = "getWeather", namespace = NameSpace.N_URI)
    GetWeather getWeather;

    public GetWeather getGetWeather() {
        return getWeather;
    }

    public void setGetWeather(GetWeather getWeather) {
        this.getWeather = getWeather;
    }

}
