package P4;

public class App {
    public static void main(String[] args) {
        StudentDto st1 = new StudentDto("시연", 26, 100);
        // 다른클래스에서 private으로 초기화하는 방법이 , 생성자로 초기화하는방식밖에없음
        st1.setName("마젠타");
        st1.setAge(29);
        st1.setScore(1000);

        // st1.name= "시연"; // write -private이라서 접근불가가
        // System.out.println(st1.name); // read

        System.out.println(st1.getName()); // 이름의 값은 읽을 수 있지만 , 문법적으로 어떠한 방법을 써도 변경 불가
        System.out.println(st1.getAge());
        System.out.println(st1.getScore());

    }
}

// setter ,getter
// Component (기능이 주가 되는 클래스 - 일반적으로는 한개의 인스턴스 생성)
// DTO = Data Transfer Object = 데이터 형태 (기능 존재 X - 속성만이 중요함) - 여러인스턴스가 생성 관리됨

// 속성 정의 클래스 , 주인클래스
// StudentDto >>  개념적으로 봤을때 기능적으로 setter getter만 갖고있으면 아무것도 없는것
// 속성만 갖고있는 상태 (write , read는 안쳐줌)
class StudentDto {
    private String name;
    private int age;
    private int score;


    
    public StudentDto(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // getter = read 권한을 준다. 왜 파라미터가 필요없고 return타입이 필요한지지
    // 불변객체
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    // setter = write 권한을 준다 .. 주의를 기울여야함... >> return 타입 필요없고 파라미터가 왜 필요한지 생각하기기
    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age){
        this.age = age;
    }

    public void setScore(int score){
        this.score = score;
    }

}