package com.caih.iexp.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.integration.support.json.Jackson2JsonObjectMapper;

import java.lang.reflect.Type;
import java.util.Map;

public class ObjectMapperFactory {

    /*static public class MyJsonToObjectMapper extends Jackson2JsonObjectMapper{
        public MyJsonToObjectMapper(ObjectMapper mapper){
            super(mapper);
        }
        @Override
        protected <T> T fromJson(Object json, JavaType type) throws Exception {
            System.out.println("from json... foo 1");
            return super.fromJson(json, type);
        }


        @Override
        public <T> T fromJson(JsonParser parser, Type valueType) throws Exception {
            System.out.println("from json ..  foo 3");
            return super.fromJson(parser, valueType);
        }

        @Override
        public <T> T fromJson(Object json, Map<String, Object> javaTypes) throws Exception {
            System.out.println("From json.. foo 2");
            return super.fromJson(json, javaTypes);
        }
    }*/

    public static Jackson2JsonObjectMapper getMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        return new Jackson2JsonObjectMapper(mapper);
    }
}
