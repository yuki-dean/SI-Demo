package com.train.xmlBeanTransformer.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getDetailInfoByTrainCodeResponse",namespace = NameSpace.WEB_URI)
@XmlAccessorType(XmlAccessType.FIELD)
public class DetailInfoByTrainCodeResponse {
    @XmlElement(name = "getDetailInfoByTrainCodeResult",namespace = NameSpace.WEB_URI)
    private DetailInfoByTrainCodeResult result;

    public DetailInfoByTrainCodeResponse() {
    }

    public DetailInfoByTrainCodeResult getResult() {
        return result;
    }

    public void setResult(DetailInfoByTrainCodeResult result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "DetailInfoByTrainCodeResponse{" +
                "result=" + result +
                '}';
    }
}
