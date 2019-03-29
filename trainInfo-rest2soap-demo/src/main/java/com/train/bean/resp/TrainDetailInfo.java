package com.train.bean.resp;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "TrainDetailInfo",namespace = NameSpace.WEB_URI)
public class TrainDetailInfo {
    @XmlAttribute(namespace = NameSpace.DIFFGR_URI)
    private String hasChanges;
    @XmlAttribute(namespace = NameSpace.DIFFGR_URI)
    private String id;
    @XmlAttribute(namespace = NameSpace.MSDATA_URI)
    private String rowOrder;

    private String TrainStation;
    private String ArriveTime;
    private String StartTime;
    private String KM;

    public String getHasChanges() {
        return hasChanges;
    }

    public void setHasChanges(String hasChanges) {
        this.hasChanges = hasChanges;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRowOrder() {
        return rowOrder;
    }

    public void setRowOrder(String rowOrder) {
        this.rowOrder = rowOrder;
    }

    public String getTrainStation() {
        return TrainStation;
    }

    public void setTrainStation(String trainStation) {
        TrainStation = trainStation;
    }

    public String getArriveTime() {
        return ArriveTime;
    }

    public void setArriveTime(String arriveTime) {
        ArriveTime = arriveTime;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getKM() {
        return KM;
    }

    public void setKM(String KM) {
        this.KM = KM;
    }

    @Override
    public String toString() {
        return "TrainDetailInfo{" +
                "hasChanges='" + hasChanges + '\'' +
                ", id='" + id + '\'' +
                ", rowOrder='" + rowOrder + '\'' +
                ", TrainStation='" + TrainStation + '\'' +
                ", ArriveTime='" + ArriveTime + '\'' +
                ", StartTime='" + StartTime + '\'' +
                ", KM='" + KM + '\'' +
                '}';
    }
}
