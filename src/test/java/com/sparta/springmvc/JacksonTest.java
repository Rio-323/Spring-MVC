package com.sparta.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.springmvc.response.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JacksonTest {

    @Test
    @DisplayName("Object To JSON : Getter 메소드 필요")
    void test1() throws JsonProcessingException {
        Star star = new Star("Robbie", 95);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(star); // Jackson 라이브러리의 ObjectMapper

        System.out.println("json = " + json);
    }

    @Test
    @DisplayName("JSON To Object : 기본 생성자 & (Getter Or Setter) 메소드 필요")
    void test2() throws JsonProcessingException {
        String json = "{\"name\":\"Robbie\",\"age\":95}"; // JSON 타입의 String

        ObjectMapper objectMapper = new ObjectMapper();

        Star star = objectMapper.readValue(json, Star.class); // 어떤 객체로 만들 것인가!!
        System.out.println("star.getname() = " + star.getName());
        System.out.println("star.getage() = " + star.getAge());
    }
}
