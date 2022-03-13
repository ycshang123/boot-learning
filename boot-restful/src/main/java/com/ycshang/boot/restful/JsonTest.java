package com.ycshang.boot.restful;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ycshang.boot.restful.model.Reader;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-10 19:47
 **/
@Slf4j
public class JsonTest {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String json = """
                {"name": "aaa",
                "age":123}"
                """;
        try {
            //序列化
            Reader reader = mapper.readValue(json, Reader.class);
            log.info(reader.toString());
            //反序列化
            Reader reader1 = new Reader("bbb", 123);
            String value = mapper.writeValueAsString(reader1);
            log.info(value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}