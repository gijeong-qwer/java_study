import java.util.Scanner;

public class P1 {
    public static void main(String[] args) { // main도 하나의 메서드 args >> argument s arg와 prama 거의 같게표현함 , 인수와 변수지만
        // Scanner sc; // 누군가가 스캐너를 정의해놨다 : API <남들이 우리를 위해 만든것 > API를 사용한다
        // sc = new Scanner(System.in); // 파라미터가 없는 생성자를 정의 하지 않았다. , 문자도 받을 수 있다 >>
        // 생성자가 오버로딩 되어있다고 예측가능 , 생성자의 형태를 볼 수 있다
        // // 문법 배우는이유 API 정확하게 쓰기 위해서

        // 메서드와 생성자의 차이점
        // 실행적 차이 : 생성자는 인스턴스 생성시 딱 한번 "자동"으로 호출됨. 그외 불가 , 반환값 없음
        // 메서드는 "직접 언제든지 호출 가능!!"하고, 여러번 가능.. , 반환값이 있음음

        StudentP1 st1 = new StudentP1(null, 0, 0); // 인스턴스 생성 > 참조주소값 st1에 저장
        // method 호출문법은 참조주소가 필요함 **** 참조주소없이는 메서드를 사용하지 못함
        st1.test1(); // 메서드 호출
        st1.test2(1, 3); // 1, 3 같은 매개변수의 값들을 argument(인수)라고함
        st1.test2(5, 7);
        System.out.println("다른 여러가지 일들 처리"); // println()의 메서드를 호출 , 파라미터로서 String타입으로 변수를 정의했다다
        st1.test1();
        st1.test1();
        System.out.println("다른 여러가지 일들 처리");

        int a = st1.test3(); // return 타입이 있는경우 >> 코드가 실행된후 결과값이 존재함 return 결과값은 3 , 결과값은 같은 타입의 변수 a에 저장할 수
                             // 있음!!
        System.out.println("test3 호출 후 a의 값 = " + a); // return의 값을 변수로 안받아도 문제는 없음

        st1.test1(); // 코드는 실행되는데 void 타입이므로 return이 없어서 절대 값을 받을 수 없음 변수에 저장불가능하단 얘기

        System.out.println("eeee"); // println 은 void 타입이므로 return이 없어서 변수에 저장 불가
        // 입체 사각형표시 : 메소드이다
        double c = Math.random(); // random 은 double 타입이기에 double타입으로 변수에 저장가능
        int d = (int) (Math.random() * 100);

        double k = Math.random(); // 메서드 설계 할 때는 return 타입 과 메서드의 역할이 어디까지인지를 고민해야함 , 수행후 더 할거 없으면 void로 처리함
        System.out.println("dafasdfsa");

        st1.test5(1); // 파라미터가 int인 test5가 호출됨
    }
}

// 응집도 = 내부의 코드들이 얼마나 잘 엮어 있는가? 보통 this를 얼마나 많이 쓰느냐로 따짐

class StudentP1 {
    // *** 필드(속성)가 제일 중요함
    // 속성 = 이 클래스 정의의 핵심, 클래스의 핵심 데이터

    String name;
    int age;
    int score;
    int count = 0;

    // 생성자 = 속성(멤버)을 초기화 하는 목적
    StudentP1(String name, int age, int score) { // ****필드의 변수를 다 받는 생성자가 제일 중요
        this.name = name;
        this.age = age;
        this.score = score;

    }

    // 기능 - 메서드
    // 문법 : 리턴타입 메서드명(매개변수..., , ...) {로직} // 메서드명은 소문자 변수명이랑 같음, 메서드명은 동사로 지음
    // 클래스명은 대문자로, 클래스명과 변수명은 명사로 지음
    // 매개변수 = 값을 받을 수 있다
    void test1() { // void는 return 타입이 존재하지 않는다!!! , 보통 study같은걸로 짓게됨
        System.out.println("test1 실행됨!!!");
        System.out.println("test1 실행 완료!!!");

    }

    // 매개변수
    void test2(int a, int b) { // test2는 로직은 있지만 호출한 결과값은 없음
        // 로직상 매개변수 값은 의미가 있어야 된다
        System.out.println("test2 실행됨!!!");
        if (a < 0) {
            return; // void이기에 아무것도 없이 반환 break;처럼쓰는것 break;는 반복문(for, while, do-while)이나 switch문에서만
                    // 사용 가능

        }

        System.out.println("매개변수 값 a = " + a);
        System.out.println("매개변수 값 b = " + b);
        System.out.println("test2 실행 완료!!!");
    }

    // return 타입
    int test3() { // test3를 호출한 결과값은 int
        System.out.println("test3 실행됨!!!");
        System.out.println("test3 실행 완료!!!");
        int result = 3;
        return result; // 첫번째 규칙 . 필연적으로 return이 존재해야함 , 간접적 변수로 return해도 타입만 같으면 상관없음
                       // return 3; return 0; 가능
                       // Strinb test3(){} 이면 return " ";
                       // int[] test3(){} 이면 return new int[4];
        // 두번째 규칙 return이후는 break랑 같아서 처리가 안됨 return은 맨마지막으로 사용
        // System.out.println("gdgd"); // 밑에코드는 unreachable; 이라서 예외처리됨
        // return 타입이 참조변수인 경우가 어려움 *** gpt 한테 문제 내달라고 하기기
    }

    int plus(int a, int b) { // 기능을 명확하게 나누어야함 Math.random(); 쓸때 그외에 출력같은거 만들면 안되니까
        // System.out.println("1+2 = "+(1+2)); 무조건 1+2만 사용하니까 코드가 정적임 >> 일반화 하지 않았다 >>
        // generalization 기준 최악
        // 일반화의 핵심 **** 매개변수
        // System.out.println("a + b = "+ (a+b)); // 단일책임 원칙에서 벗어남
        System.out.println("plus 호출됨");

        if (a < 0 || b < 0) {
            return 0; // return이 중간에 들어가는 경우 -조건에 의해서
            // for 문 (반복문) break와 비슷한 역할
        }

        System.out.println("plus 연산 시작");
        return a + b; // 더하는 메소드이니까 출력기능은 다른 메소드에 넘김

        // return 타입이 존재하는 경우 어떠한 경우라도 !!!! 무조건 return 있어야함
    }

    // 내부에서 this(중요)**** 활용 가능능
    void test4(int a) {
        // int a = 10; // 파라미터는 지역변수이므로 int a 불가
        int b = 10; // test4의 사용 가능 변수
                    // 멤버변수(필드) : name ,age ,score ,count
        System.out.println(a);
        System.out.println(b);

        this.test1(); // 참조주소 없이는 호출 불가 !!!! 절대 !!!! // 내부의 메소드 호출도 가능
        // 동일한 이유로 this를 빼도됨 <문법적 허용>
        test1(); // this.test1();

        System.out.println(name); // 문법적 허용 // System.out.println(this.name); <정확한 표현 방법>
        System.out.println(age); // System.out.println(this.age);
        System.out.println(score); // System.out.println(this.age);

    }

    // 메서드 오버로딩 - 매개변수의 형태가 다르면 선언이 된다
    // 애초에 오버로딩 판별기준이 매개변수의 형태에 따라서임
    void test5() {
        System.out.println("test5 - 1 호출 됨");
    }

    void test5(int a) {
        System.out.println("test5 - 2 호출 됨");
    }

    void test5(int a, int b) {
        System.out.println("test5 - 3 호출 됨");
    }

    void test5(String a) {
        System.out.println("test5 - 4 호출 됨");
    }

    void test5(double a) {
        System.out.println("test5 - 5 호출 됨");
    }

}

// 프레임워크 개발자 : 클래스로 API 만드는거

// 생성자가 필요한 이유 : 다른사람들을 위해 구조를 만들때 ,
// 코드를 추상적이고 일반화시키기 위해