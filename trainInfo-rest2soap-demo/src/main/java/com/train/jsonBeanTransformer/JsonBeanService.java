package com.train.jsonBeanTransformer;

import org.springframework.stereotype.Service;

@Service("jsonBeanService")
public class JsonBeanService {
    public void jsonBeanService(Object object) {
        System.out.println("jsonBeanService:" + object.toString());
    }
}
