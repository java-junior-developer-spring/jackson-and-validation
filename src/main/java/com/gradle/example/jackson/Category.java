package com.gradle.example.jackson;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

// в строку json не войдут поля, у которых значения свойств null.
// Можно использовать для отдельных полей
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Category extends Identify {
    private String name;
    private String description;

    // @JsonManagedReference // включаем в сериализацию
    private List<Cat> cats = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }
}