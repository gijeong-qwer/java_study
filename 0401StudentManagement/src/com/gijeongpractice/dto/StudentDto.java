package com.gijeongpractice.dto;

public class StudentDto {
    // Data transfer object
    // Dto는 필요한 변수들을 private 처리하고
    // 인스턴스로 묶어서 사용하기 위함
    // Dto의 초기화는 보통 생성자를 통해서함

    // --- 보관할 정보 입력
    private String name;
    private int age;
    private int score;

    public StudentDto() {
    }

    // public class 생성자는 명시적으로 public 붙여줘야함 >> 안붙이면 default붙여서 외부에서 못씀
    public StudentDto(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // ---------------------
    // 정보 수정 밑 획득

    // static처리 흠... 인스턴스를 생성했다는 기준하에 static처리하면 접근해서 사용가능한가?>?
    // 근데 인스턴스가 생성됬는데 static처리할필요없는데 그냥 메서드 접근하면되는데
    // static으로 처리하면 접근 못하나 하나 만들어봐야지
    public String getName() {
        return name;
    }

    // static 필드가 아닌건 참조 할 수 없다는데 static 메서드는 static 변수만 참조 가능한건가..? 뭐지
    // public static String gettName(){
    // return name;
    // }

    public void setName(String name) {
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
