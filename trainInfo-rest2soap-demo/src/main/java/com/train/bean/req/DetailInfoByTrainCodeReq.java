package com.train.bean.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <getDetailInfoByTrainCode xmlns="http://WebXml.com.cn/">
 * <TrainCode>string</TrainCode>
 * <UserID>string</UserID>
 * </getDetailInfoByTrainCode>
 */

@XmlRootElement(name = "getDetailInfoByTrainCode",namespace = NameSpace.BASIC_URI)
@XmlAccessorType(XmlAccessType.FIELD)
public class DetailInfoByTrainCodeReq {
    @XmlElement(name="TrainCode",namespace = NameSpace.BASIC_URI)
    private String TrainCode;
    @XmlElement(name="UserID",namespace = NameSpace.BASIC_URI)
    private String UserID;

    public DetailInfoByTrainCodeReq() {
    }

    public String getTrainCode() {
        return TrainCode;
    }

    public void setTrainCode(String trainCode) {
        TrainCode = trainCode;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

}
