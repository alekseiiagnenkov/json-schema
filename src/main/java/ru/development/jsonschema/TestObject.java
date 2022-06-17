package ru.development.jsonschema;

import ru.development.api.dto.object.JsonObjectBoxDto;
import ru.development.api.dto.object.JsonObjectDto;

import java.util.*;

public class TestObject {
    public static void main(String[] args) {
        List<JsonObjectDto> dtoList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            JsonObjectDto dto = new JsonObjectDto();
            dto.setSomeProperty1("first " + i);
            dto.setSomeProperty2("second " + i);
            dtoList.add(dto);
        }

        JsonObjectBoxDto dtoBox = new JsonObjectBoxDto();
        dtoBox.setObjectId("someId");
        dtoBox.setObjectList(dtoList);

        System.out.println(dtoBox);
    }
}
