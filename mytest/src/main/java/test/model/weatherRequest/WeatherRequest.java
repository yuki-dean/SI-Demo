package test.model.weatherRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Envelope", namespace = NameSpace.SOAP12_URI)
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherRequest {
    @XmlElement(namespace = NameSpace.SOAP12_URI)
    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
