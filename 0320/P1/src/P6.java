import java.util.Scanner;

public class P6 {
    public static void main(String[] args) { // 오버로딩과 오버라이딩 구분 ****오버라이딩은 엄청중요!! 상속관련개념이라 사실 비슷

        Scanner xxx = new Scanner(System.in);

        int a = 10; // 지역변수 : 지역내에서만 쓸 수 있는 변수

        // StudentP6 st0 = new StudentP6(); >> 불가

        // StudentP6 st1 = new StudentP6(123); // 생성자의 매개변수가 정의되어있으면 그 형태로 매개변수를 정의해줘야함
        // st1.name = "기정";
        // st1.age = 30;
        // st1.score = 70;

        // StudentP6 st2 = new StudentP6(a);
        // st2.name = "시연";
        // st2.age = 19;
        // st2.score = 99;

        // StudentP6 st3 = new StudentP6(a+"",33);

        StudentP6 st1 = new StudentP6("한조", 30, 70);
        StudentP6 st2 = new StudentP6("트레", 19, 99);
        StudentP6 st3 = new StudentP6(null, 0, 0); // 초기화를 해준다는 느낌이라 기분이나쁨
        StudentP6 st4 = new StudentP6();
        StudentP6 st5 = new StudentP6("메르시", 40);

        System.out.println(st1.name); // 위 아래 차이는 this 차이 실행될때의 this의 주소값이다름 위와 아래는는
        System.out.println(st2.name); //

    }
}

class StudentP6 {
    String name; // 멤버변수
    int age;
    int score;

    // 생성자 ... constructor
    // 소괄호 안에 매개변수 parameter 선언 가능 - 단 , 인스턴스 생성시(new) 정의를 새로해야함함
    // StudentP6(int k) { // 생성자에 있어서 매개변수 정의를 하면, 문법오류가 발생
    // System.out.println("생성자1 실행됨!!!");
    // System.out.println(k);

    // }

    // StudentP6(String a, int b) {
    // System.out.println("생성자2 실행됨!!!");
    // System.out.println(a);
    // }

    StudentP6(String name, int b, int c) {

        System.out.println("생성자1 실행됨!!!");

        // name = name; // 중첩됬을땐 우선으로 지역변수를 인지함 자기한테 자기 넣은상태
        this.name = name; // this 문법적으로 정의된 주소값 , this를 잘쓰면 응집도가 보통 높음
        age = b; // 지역변수의 age가 없다는 가정하에 this를 안써도됨 age = age; 안됨
        this.score = c; // 생성자는 앞으로 이렇게 쓸것 같은 이름인 경우

        System.out.println(name);
        // System.out.println(a);

        System.out.println("생성자 실행 완료!!!");

    }

    // 생성자 오버로딩 : 하나의 클래스에는 생성자 여러개를 선언할 수 있다. 타입만 똑같지 않으면됨 >> 순서 바뀌면 사용 가능
    StudentP6() {
        System.out.println("기본 생성자 실행 됨!!");
    }

    StudentP6(String name, int age) {
        this(name, age, 0); // this() 같은이름의 매개변수를 가진 오버로딩된 함수를 찾아서 사용

        // System.out.println("2개 짜리 생성자가 실행됨");
        // this.name = name;
        // this.age = age;

    }

}