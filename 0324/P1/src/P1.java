public class P1 {
    public static void main(String[] args) {

        StudentP1.count = 30; // 인스턴스 생성과 상관없이 사용 가능하다

        // **** 인스턴스에서 생각할거 : 힙메모리 스택메모리 참조변수 >> 메모리의 동작구조
        final StudentP1 s2yeon = new StudentP1(); // s2yeon이 제한됨
        StudentP1 magenta = new StudentP1("마젠타", 29, 100);

        s2yeon.name = "시연"; // 필드에 직접적으로 접근 -> Java 기준으로는 앞으로 쓸일 없음
        // 변수 s2yeon만 제한된것이지 name은 제한된게 아니라 가능능
        s2yeon.study(3); // 메서드 호출!!
        YYY a1 = new YYY();
        a1.test(s2yeon); // StudentP1 클래스 s2yeon의 필드 name에 ddd 저장장
        System.out.println(s2yeon.name + "(이)가 공부를 합니다.");

    }
}

class StudentP1 {
    // 필드 (속성, 인스턴스 변수 혹은 클래스 변수 , 멤버 변수 )
    String name;
    int age;
    int score;
    static int count = 0; // count는 이 클래스의 필드인가요? O 속성인가요? O
    // 인스턴스 변수인가요? X 클래스 변수 static이 붙어있음
    // static final을 더 많이씀 final static보다 순서상관x

    // 생성자 정의 구간
    StudentP1() {
    }

    StudentP1(String name, int age, int score) { // 오버로딩: 같은함수명 다른 매개변수
        name = name; // this.name = name;
        age = age; // this.age = age;
        score = score; // this.score = score;

    }

    // 메서드 정의 구간
    void study(int hour) {
        System.out.println(this.name + "(이)가 공부를 합니다."); // name만 써도 가능
        this.score += hour; // score만 써도 가능
    }
}

class YYY {
    void test(StudentP1 s2yeon) {
        s2yeon.name = "시요밍";
    }

    void test2() {
        StudentP1.count = 30;
    }
}
