package com.train.xmlBeanTransformer.response;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Diffgram {

    @XmlElementWrapper(name = "getDetailInfo")
    @XmlElements(value = {@XmlElement(name = "TrainDetailInfo", type = TrainDetailInfo.class)})
    private List<TrainDetailInfo> detailInfos;

    public Diffgram() {
    }

    public List<TrainDetailInfo> getDetailInfos() {
        return detailInfos;
    }

    public void setDetailInfos(List<TrainDetailInfo> detailInfos) {
        this.detailInfos = detailInfos;
    }

    @Override
    public String toString() {
        return "Diffgram{" +
                "detailInfos=" + detailInfos +
                '}';
    }
}
