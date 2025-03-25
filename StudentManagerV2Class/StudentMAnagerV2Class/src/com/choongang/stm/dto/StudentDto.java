package com.choongang.stm.dto;

// DTO = Data Transfer Object
// 데이터의 형태를 정의 (최우선순위)

public class StudentDto {
    private String name;
    private int age;
    private int score;

    public StudentDto() {
    }

    public StudentDto(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // 관례
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
