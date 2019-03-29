package com.train.bean.resp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DetailInfoByTrainCodeResult {

    @XmlElement(name = "diffgram",namespace = NameSpace.DIFFGR_URI)
    private Diffgram diffgram;

    public DetailInfoByTrainCodeResult() {
    }

    public Diffgram getDiffgram() {
        return diffgram;
    }

    public void setDiffgram(Diffgram diffgram) {
        this.diffgram = diffgram;
    }

    @Override
    public String toString() {
        return "DetailInfoByTrainCodeResult{" +
                "diffgram=" + diffgram +
                '}';
    }
}
