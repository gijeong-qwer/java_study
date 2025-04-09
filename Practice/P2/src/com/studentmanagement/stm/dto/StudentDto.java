package com.studentmanagement.stm.dto;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

}

// 데이터링크 계층 - 둘이서만 데이터 주고받는단계
// 네트워크 계층 -핵심Ip
// 전송계층 -port 를 다룸