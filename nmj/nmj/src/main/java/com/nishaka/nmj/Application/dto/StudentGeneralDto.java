package com.nishaka.nmj.Application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class StudentGeneralDto {
    private Integer id;
    private String name;
    private Integer grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
