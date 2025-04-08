package com.choongang.stm.dto;

// DTO = 핵심 자료 (데이터의 형태를 정의한다!!) DTO 기능존재 X 
// DTO 의 개수와 연관관계가 프로그래밍의 난이도를 정한다 
public class StudentDto {

    private String name;
    private int age;
    private int score;

    // 외부 패키지와 연결하려면 클래스타입에 꼭 맞춰야함
    // 기본생성자 >> 스프링프레임워크가 필수로 요구해서 항상 작성하는거 습관들이기
    public StudentDto() {

    }

    public StudentDto(String name, int age, int score) {

        this.name = name;
        this.age = age;
        this.score = score;

    }

    // setter
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
