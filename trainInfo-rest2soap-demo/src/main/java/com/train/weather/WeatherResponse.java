package com.train.weather;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherResponse {
    @XmlElementWrapper(name = "getWeatherResult",namespace = NameSpace.BASIC_URI)
    @XmlElements(value = {@XmlElement(name = "string",namespace = NameSpace.BASIC_URI)})
    private List<String> weatherResult;

    public List<String> getWeatherResult() {
        return weatherResult;
    }

    public void setWeatherResult(List<String> weatherResult) {
        this.weatherResult = weatherResult;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "weatherResult=" + weatherResult +
                '}';
    }
}
