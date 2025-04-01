package p1.dto;

public class Studentdto { // 개허접함 , 생성자로 초기화 할 수 있는데 진짜.. 하
    private String name;
    private int score;
    private int age;

    public Studentdto() {
    }

    public Studentdto(String name, int age, int score) { // public class 생성자 항상 public 붙이기**
        this.name = name;
        this.score = score;
        this.age = age;
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
