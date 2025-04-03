package p9;

import java.util.*;
import java.util.stream.Collectors;

// 변수로 interface를 요구한다 >> 클래스 정의해도되고 , 람다로 풀어도되고 
public class App {
    public static void main(String[] args) {
        // Repository
        List<StudentEntity> entityList = new ArrayList<>();
        entityList.add(new StudentEntity("시연", 26, 100));
        entityList.add(new StudentEntity("히나", 25, 100));
        entityList.add(new StudentEntity("마젠타", 28, 100));
        entityList.add(new StudentEntity("쵸단", 28, 100));

        // Entity 리스트 -> Dto 리스트로 변환!! (매우 자주 발생)
        // List<StudentDto> dtoList = new ArrayList<>();
        // for(StudentEntity entity : entityList){
        // dtoList.add(new StudentDto(entity));
        // }
        // 위의 코드와 아래의 코드는 동일한 코드
        // entityList.stream().map(entity ->{
        // return new StudentDto(entity);
        // } );

        // entityList.stream()
        // .map(entity -> new StudentDto(entity));
        // entityList.stream()
        // .map(StudentDto::new) // 생성자가 잘 정의되어있어야 가능 , 이코드 포함 4개는 동일 코드(주석들)
        // .collect(Collectors.toList());

        entityList.stream()
                .map(e -> e.toDto()) // 생성자가 잘 정의되어있어야 가능 , 이코드 포함 4개는 동일 코드(주석들)
                .collect(Collectors.toList());

    }
}

class StudentDto {
    private String name;
    private int age;
    private int score;

    // 정적 팩토리 메서드 패턴 : Factory Method
    public static StudentDto from(StudentEntity entity) { // ~로부터 Dto를 생성하겠다 >> 생성자 막아두고 이렇게 제작함 현업에서는
        return new StudentDto(entity);
    }

    public StudentDto(StudentEntity entity) {
        this.name = entity.getName();
        this.age = entity.getAge();
        this.score = entity.getScore();
    }

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

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}

class StudentEntity {
    private String name;
    private int age;
    private int score;

    public StudentDto toDto() {
        return new StudentDto(this);
    }

    public StudentEntity() {
    }

    public StudentEntity(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}

class RequestStudentDto {
    private String name;
    private int age;
    private int score;

    public RequestStudentDto() {
    }

    public RequestStudentDto(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

}