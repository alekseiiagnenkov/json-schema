package ru.development.jsonschema;

import ru.development.api.dto.object.JsonObjectBoxDto;
import ru.development.api.dto.object.JsonObjectDto;

import java.util.ArrayList;
import java.util.List;

public class TestObject {
    public static void main(String[] args) {
        List<JsonObjectDto> dtoList = createDtoList();
        JsonObjectBoxDto dtoBox = createJsonObjectBoxDto(dtoList);
        System.out.println(dtoBox);
    }

    private static JsonObjectBoxDto createJsonObjectBoxDto(List<JsonObjectDto> dtoList) {
        JsonObjectBoxDto dtoBox = new JsonObjectBoxDto();
        dtoBox.setObjectId("someId");
        dtoBox.setObjectList(dtoList);
        return dtoBox;
    }

    private static List<JsonObjectDto> createDtoList() {
        List<JsonObjectDto> dtoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JsonObjectDto dto = new JsonObjectDto();
            dto.setSomeProperty1("first " + i);
            dtoList.add(dto);
        }
        return dtoList;
    }
}
