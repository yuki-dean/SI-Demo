package com.train.jsonBeanTransformer;

public class TrainReq {
    private String TrainCode;
    private String UserID;

    public TrainReq() {
    }

    public TrainReq(String trainCode, String userID) {
        TrainCode = trainCode;
        UserID = userID;
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

    @Override
    public String toString() {
        return "TrainReq{" +
                "TrainCode='" + TrainCode + '\'' +
                ", UserID='" + UserID + '\'' +
                '}';
    }
}
