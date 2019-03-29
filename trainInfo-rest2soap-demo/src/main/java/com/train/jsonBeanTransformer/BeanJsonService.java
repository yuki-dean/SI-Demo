package com.train.jsonBeanTransformer;

import org.springframework.stereotype.Service;

@Service("beanJsonService")
public class BeanJsonService {
    public void beanJsonService(Object object) {
        System.out.println("beanJsonService:" + object.toString());
    }
}
