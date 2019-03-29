package com.train.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Body {
    @XmlElement(name = "getWeatherResponse",namespace = NameSpace.BASIC_URI)
    private WeatherResponse weatherResponse;

    public WeatherResponse getWeatherResponse() {
        return weatherResponse;
    }

    public void setWeatherResponse(WeatherResponse weatherResponse) {
        this.weatherResponse = weatherResponse;
    }

    @Override
    public String toString() {
        return "Body{" +
                "weatherResponse=" + weatherResponse +
                '}';
    }
}
