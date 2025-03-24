import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Practice1 st1 = new Practice1(); // st1 스택에 할당 힙영역에 practice1관련 인스턴스 생성
        int a = st1.test1;
        System.out.println(a);
        st1.test1 = 3;

        a = st1.test1;
        System.out.println(a);

        st1.testing1();
        st1.testing1(7);
        a = st1.testing1(a, a);
        System.out.println(a);

        Scanner sc = new Scanner(System.in);  
        //Scanner는 클래스이고 Scanner()은 클래스의 메소드이다
        // new를 쓴이유는 인스턴스를 생성하고 싶어서이고
        // sc 참조변수 선언을 통해 인스턴스의 주소를 저장한다
        // System.in은 System이 클래스명이므로 in이 static 변수임을 알 수 있다
        // in은 InputStream을 type으로 받는다.
        // Scanner의 생성자는 InputStream을 매개변수로 받아, 입력을 처리할 준비를 함.
        // System.in은 InputStream이므로 Scanner가 이를 받아들이고, 입력을 읽는 도구가 됨.
        // sc는 Scanner 메소드를 통해 입력을 받는다
        // 파라미터가 없는 생성자를 정의 하지 않았다. , 문자도 받을 수 있다 
        // 생성자가 오버로딩 되어있다고 예측가능 , 생성자의 형태를 볼 수 있다
        
        // 메서드와 생성자의 차이점
        // 실행적 차이 : 생성자는 인스턴스 생성시 딱 한번 "자동"으로 호출됨. 그외 불가 , 반환값 없음
        // 메서드는 "직접 언제든지 호출 가능!!"하고, 여러번 가능.. , 반환값이 있음음

        Practice1 stu = new Practice1(null, a, a);
        // method 호출문법은 참조주소가 필요함 *** 참조주소없이는 메서드를 사용하지 못함
        stu.testing1(); // 메서드 호출
        stu.testing1(1, 3); // 1, 3과 같은 매개변수의 값들을 argument(인수)라고함
        System.out.println("여러가지 일 처리"); // println()의 메서드를 호출, 
        //파라미터로서 String 타입으로 변수를 정의했다
        int b = stu.testing1(1, 3); // return 타입이 있는경우 >> 코드가 실행된후 결과값이 존재함
        // return 의결과값은 2  int 타입 변수 b 는 2를 저장하게됨 
        // return의 값을 변수로 안받아도 문제는 없음
        stu.testing1(); // 코드는 실행되는데 void 타입이므로 return이 없어서 
        // 절대 값을 받을 수 없는 상태 >> 변수에 저장 불가능함!!!
        System.out.println("hihi"); // println의 타입은 void이므로 변수에 저장이 불가

        double c = Math.random(); // random 은 double 타입이기에 double타입으로 변수에 저장가능
        int d = (int) (Math.random() * 100);

        double k = Math.random(); // 메서드 설계 할 때는 return 타입 과 메서드의 역할이 어디까지인지를 고민해야함 , 수행후 더 할거 없으면 void로 처리함
        
        stu.testing1(3,7); // 파라미터가 int타입 3,7인 testing1 호출 >> return값은 2

        double y = Math.sin(5); // 프로모션
        System.out.println(y);
    }
}

class Practice1 {
    // **** 필드 (속성)가 제일 중요함
    // 속성 = 이 클래스 정의의 핵심, 클래스의 핵심 데이터터
    String name;
    int test1 = 7;
    int test2;

    // 응집도 = 내부의 코드들이 얼마나 잘 엮어 있는가? 보통 this를 얼마나 많이 쓰느냐로 따짐짐  
    // 생성자 = 속성(멤버)을 초기화 하는 목적
    Practice1(String name,int age,int score){ // ****필드의 변수를 다 받는 생성자가 제일 중요요
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
    }
    Practice1(){

    }
     // 기능 - 메서드
    // 문법 : 리턴타입 메서드명(매개변수..., , ...) {로직} // 메서드명은 소문자 변수명이랑 같음, 메서드명은 동사로 지음
    // 클래스명은 대문자로, 클래스명과 변수명은 명사로 지음
    // 매개변수 = 값을 받을 수 있다

    void testing1() {// void는 return 타입이 존재하지 않는다!!! , 변수명은 보통 study같은걸로 짓게됨
        System.out.println("11111111");
    }

    void testing1(int a) { //testing1로직은 있지만 , 호출한 결과값은 없음
        // 로직상 매개변수값은 의미가 있어야한다 *** 없으면 그 클래스에 있어야할게 아닌것
        if(a<0){
            return;
            // void이기에 아무것도 없이 반환 break;처럼쓰는것 break;는 반복문(for, while, do-while)이나 
            //switch문에서만 사용가능
        }


        System.out.println("222222222");
    }
    // return 타입 : 메서드의 타입과 return타입이 같아야함, 간접적 변수로 return해도 타입만 같으면 상관없음음
    //  두번째 규칙 return이후는 break랑 같아서 처리가 안됨 return은 맨마지막으로 사용
    int testing1(int a, int b) {
        System.out.println("333333333");

        this.testing1(); // 같은의미미
        testing1();
        
        return 2;

    }

}
// 메서드
// 자바에서 오버로딩이 가능하려면 "메서드 시그니처(Method Signature)"가 달라야 해.
// 메서드 시그니처는 메서드 이름 + 매개변수의 타입 & 개수를 의미하고, 반환 타입은 포함되지 않아.
// 메서드 오버로딩 - 매개변수의 형태가 다를 때 

// 생성자가 필요한 이유 : 다른사람들을 위해 구조를 만들때 ,
// 코드를 추상적이고 일반화시키기 위해
// System.out.println(new int[5]); // 주소값을 넘긴것
// 사용가능한 매개변수가 많다 >> 오버로딩된 메서드가 많다