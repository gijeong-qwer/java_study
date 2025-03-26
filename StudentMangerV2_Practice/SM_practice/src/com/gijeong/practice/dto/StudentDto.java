package com.gijeong.practice.dto;

// 데이터의 형태를 정의 (최우선순위) , DTO = Data Transfer Object
public class StudentDto {
    private String name;
    private int age;
    private int score;

    public StudentDto() {
    }

    // public void StudentDto(String name, int age , int score) 생성자를 쓰려고한건데 void를 씀
    // >> void 쓰면 생성자가 아닌 메서드로 인식
    public StudentDto(String name, int age, int score) { // static은 this를 쓸 수 없으므로 static을 쓰면 안됨 **** >> 미숙해서 생기는 실수
                                                         // 기억하기기
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // getter 정보를 얻어와야하므로 return이 필요함함
    public String getName() { // private에 접근하려면 this를 써야하는데 그러면 자연스럽게 static키워드를 안쓰게됨
        // static 메서드가 많으면 상태를 안 가진다는 뜻이므로, 객체지향적이지 않을 수 있어.
        // 반대로 instance 메서드 + private 필드 + this 조합은 전형적인 OOP 스타일이야.
        return name;
    }

    public void setName(String name) { // 변수에 대한 변형을 주기 위함이므로 return이 필요없음
        this.name = name;
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
