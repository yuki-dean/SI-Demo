package com.caih.iexp.model.weatherResponse;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "getWeatherResponse", namespace = NameSpace.N_URI)
@XmlAccessorType(XmlAccessType.FIELD)
public class GetWeatherResponse {

//    @XmlElementWrapper(name = "getWeatherResult", namespace = NameSpace.N_URI)
//    @XmlElements(value = {@XmlElement(name = "string", namespace = NameSpace.N_URI)})
    @XmlElementWrapper(name = "getWeatherResult", namespace = NameSpace.N_URI)
    @XmlElement(name = "string", namespace = NameSpace.N_URI)
    private List<String> getWeatherResult ;

    public List<String> getGetWeatherResult() {
        return getWeatherResult;
    }

    public void setGetWeatherResult(List<String> getWeatherResult) {
        System.out.println("getWeatherResult");
        this.getWeatherResult = getWeatherResult;
    }
}
