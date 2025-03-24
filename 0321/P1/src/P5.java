public class P5 {
    public static void main(String[] args) {
        // static
        // v2 = 10; 이런건 안됨 인스턴스와 상관없다는건 인스턴스 참조 주소와 관련없다는것 참조주소.이 아닌
        AAAP5.v2++; // 클래스명. 클래스 변수; ,인스턴스 선언과 상관없이 클래스명으로 쓸 수 있음
        System.out.println("클래스 변수 V2 :" + AAAP5.v2);

        AAAP5 a1 = new AAAP5();
        AAAP5 a2 = new AAAP5();

        AAAP5.v2 = 30;
        System.out.println(AAAP5.v2);

        int a = 10;
        AAAP5.test2(); // static 잘안쓰려고 하는이유 >> 계속 메모리를 차지하니까

        a1.v1++; // 객체의 필드값을 증가시킴
        a2.v1++;
        System.out.println(a1.v1);
        System.out.println(a2.v1);

        a1.v2++; // 아무도 이렇게 코드 안쓰긴함 , 단 한명도 이렇게 안짬 , 문법오류급
        System.out.println(a1.v2);
        a2.v2++;
        System.out.println(a1.v2);
        System.out.println(a2.v2);
    }
}
// stack => 지역변수를 저장 heap = > new 키워드가 사용되는 녀석들 ex) 배열 , 배열도 하나의 인스턴스
// a1 ,a2 = 지역변수

class SomeComponent {
    void test() {
        AAAP5.v2 = 50; // static은 문법적으로 어디서든지 사용이 가능함 >> 다른클래스에서도 사용가능

        AAAP5.test2();
    }
}

// 사실상 안섞어씀 : 인스턴스하고 스태틱은 거의 안섞어 쓰는게 정석석

class AAAP5 {
    int v1 = 0; // 인스턴스 변수 // 인스턴스와 관련된변수 , 인스턴수변수  , 지역변수가 아님님
    static int v2 = 0; // 클래스 변수 (전역변수처럼 사용) // 메서드 영역에서 생성, 인스턴스와 상관없이 무조건 생성됨
    // static = 인스턴스와 무관 // static은 프로그램 처음 사용된 시점부터 생성되고 메모리 소멸은 프로그램이 끝날때 가능 //
    // 그리고 한개만 : 같은 공간을 사용한다는것것
    int v3 = 0; // 인스턴스 변수

    void test1() {
        this.v1 = 10;
    }

    // 메서드에도 static을 붙일 수 있다
    static void test2() { // 인스턴스 생성과 관련이 없는 메서드 AAAP5.test2(); 로 호출가능능
        v2 = 30; // AAAP5.v2=30;
    }

}
