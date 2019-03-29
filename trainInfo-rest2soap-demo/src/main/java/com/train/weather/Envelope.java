package com.train.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Envelope",namespace = NameSpace.SOAP_URI)
public class Envelope {
    @XmlElement(name = "Body",namespace = NameSpace.SOAP_URI)
    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "body=" + body +
                '}';
    }
}
