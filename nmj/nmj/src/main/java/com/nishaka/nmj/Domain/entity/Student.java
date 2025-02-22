package com.nishaka.nmj.Domain.entity;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "student")
@DynamicUpdate
@JsonPropertyOrder({"id", "name", "address", "email", "grade"})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;
    private String email;
    private Integer grade;

    public Student() {
    }

    public Student(Integer id, String name, String address, String email, Integer grade) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.grade = grade;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
