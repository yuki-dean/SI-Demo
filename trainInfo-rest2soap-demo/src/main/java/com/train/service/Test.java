package com.train.service;

public class Test {
    public static void main(String args[]) {

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<getDetailInfoByTrainCodeResponse xmlns=\"http://WebXml.com.cn/\">\n" +
                "    <getDetailInfoByTrainCodeResult>\n" +
                "        <xs:schema xmlns=\"\" xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\"\n" +
                "                   xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" id=\"getDetailInfo\">\n" +
                "            <xs:element msdata:IsDataSet=\"true\" msdata:UseCurrentLocale=\"true\" name=\"getDetailInfo\">\n" +
                "                <xs:complexType>\n" +
                "                    <xs:choice maxOccurs=\"unbounded\" minOccurs=\"0\">\n" +
                "                        <xs:element name=\"TrainDetailInfo\">\n" +
                "                            <xs:complexType>\n" +
                "                                <xs:sequence>\n" +
                "                                    <xs:element minOccurs=\"0\" name=\"TrainStation\" type=\"xs:string\"/>\n" +
                "                                    <xs:element minOccurs=\"0\" name=\"ArriveTime\" type=\"xs:string\"/>\n" +
                "                                    <xs:element minOccurs=\"0\" name=\"StartTime\" type=\"xs:string\"/>\n" +
                "                                    <xs:element minOccurs=\"0\" name=\"KM\" type=\"xs:short\"/>\n" +
                "                                </xs:sequence>\n" +
                "                            </xs:complexType>\n" +
                "                        </xs:element>\n" +
                "                    </xs:choice>\n" +
                "                </xs:complexType>\n" +
                "            </xs:element>\n" +
                "        </xs:schema>\n" +
                "        <diffgr:diffgram xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\"\n" +
                "                         xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\">\n" +
                "            <getDetailInfo xmlns=\"\">\n" +
                "                <TrainDetailInfo diffgr:hasChanges=\"inserted\" diffgr:id=\"TrainDetailInfo1\" msdata:rowOrder=\"0\">\n" +
                "                    <TrainStation>桂林北（车次：G2901）</TrainStation>\n" +
                "                    <ArriveTime/>\n" +
                "                    <StartTime>10:58:00</StartTime>\n" +
                "                    <KM>1</KM>\n" +
                "                </TrainDetailInfo>\n" +
                "                <TrainDetailInfo diffgr:hasChanges=\"inserted\" diffgr:id=\"TrainDetailInfo2\" msdata:rowOrder=\"1\">\n" +
                "                    <TrainStation>钟山西</TrainStation>\n" +
                "                    <ArriveTime>11:48:00</ArriveTime>\n" +
                "                    <StartTime>11:50:00</StartTime>\n" +
                "                    <KM>1</KM>\n" +
                "                </TrainDetailInfo>\n" +
                "                <TrainDetailInfo diffgr:hasChanges=\"inserted\" diffgr:id=\"TrainDetailInfo3\" msdata:rowOrder=\"2\">\n" +
                "                    <TrainStation>贺州</TrainStation>\n" +
                "                    <ArriveTime>12:02:00</ArriveTime>\n" +
                "                    <StartTime>12:05:00</StartTime>\n" +
                "                    <KM>1</KM>\n" +
                "                </TrainDetailInfo>\n" +
                "                <TrainDetailInfo diffgr:hasChanges=\"inserted\" diffgr:id=\"TrainDetailInfo4\" msdata:rowOrder=\"3\">\n" +
                "                    <TrainStation>广州南</TrainStation>\n" +
                "                    <ArriveTime>13:30:00</ArriveTime>\n" +
                "                    <StartTime>13:34:00</StartTime>\n" +
                "                    <KM>1</KM>\n" +
                "                </TrainDetailInfo>\n" +
                "                <TrainDetailInfo diffgr:hasChanges=\"inserted\" diffgr:id=\"TrainDetailInfo5\" msdata:rowOrder=\"4\">\n" +
                "                    <TrainStation>深圳北</TrainStation>\n" +
                "                    <ArriveTime>14:03:00</ArriveTime>\n" +
                "                    <StartTime/>\n" +
                "                    <KM>1</KM>\n" +
                "                </TrainDetailInfo>\n" +
                "            </getDetailInfo>\n" +
                "        </diffgr:diffgram>\n" +
                "    </getDetailInfoByTrainCodeResult>\n" +
                "</getDetailInfoByTrainCodeResponse>";

        String[] resps = xml.split("getDetailInfo");
        int i = 1;
        for (String r : resps) {
            if (r.contains("TrainDetailInfo")) {
                r= "<getDetailInfo" + r + "getDetailInfo>";
            }
            System.out.println(i + ":" + r);
            i++;
        }
    }
}
