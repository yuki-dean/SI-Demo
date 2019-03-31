package test.model.weatherResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Body {
    @XmlElement(name = "getWeatherResponse", namespace = NameSpace.N_URI)
    private GetWeatherResponse getWeatherResponse;

    public GetWeatherResponse getGetWeatherResponse() {
        return getWeatherResponse;
    }

    public void setGetWeatherResponse(GetWeatherResponse getWeatherResponse) {
        this.getWeatherResponse = getWeatherResponse;
    }

}
