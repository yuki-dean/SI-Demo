package com.train.xmlBeanTransformer.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *  <getDetailInfoByTrainCode xmlns="http://WebXml.com.cn/">
 *       <TrainCode>string</TrainCode>
 *       <UserID>string</UserID>
 *     </getDetailInfoByTrainCode>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getDetailInfoByTrainCode",namespace = NameSpace.BASIC_URI)
public class DetailInfoByTrainCodeReq {
    private String TrainCode;
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
