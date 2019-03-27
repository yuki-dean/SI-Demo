package com.train.xmlBeanTransformer.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "getDetailInfo")
public class DetailInfo {

    @XmlElement(name = "TrainDetailInfo",namespace = NameSpace.WEB_URI)
    private List<TrainDetailInfo> trainDetailInfo;

    public DetailInfo() {
    }

    public List<TrainDetailInfo> getTrainDetailInfo() {
        return trainDetailInfo;
    }

    public void setTrainDetailInfo(List<TrainDetailInfo> trainDetailInfo) {
        this.trainDetailInfo = trainDetailInfo;
    }

    @Override
    public String toString() {
        return "DetailInfo{" +
                "trainDetailInfo=" + trainDetailInfo +
                '}';
    }
}
