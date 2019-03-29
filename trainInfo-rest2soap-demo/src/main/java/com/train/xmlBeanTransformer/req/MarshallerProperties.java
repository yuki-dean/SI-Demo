package com.train.xmlBeanTransformer.req;

import javax.xml.bind.Marshaller;
import java.util.HashMap;

public class MarshallerProperties {
    public static final HashMap<String, Object> properties = new HashMap<String, Object>();

    static {
        //格式化xml格式
        properties.put(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //去掉生成xml的默认报文头
        properties.put(Marshaller.JAXB_FRAGMENT, true);
    }
}
