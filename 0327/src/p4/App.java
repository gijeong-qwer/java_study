package p4;

public class App {
    public static void main(String[] args) {
        // 오버라이딩 (재정의: 메서드를 재정의 하겠다) 문법은 무조건 참조타입 기준으로 생각하면됨 오른쪽가리고 왼쪽만 보기 참조타입 A =
        AAA refA = new AAA();
        refA.methodA();

        BBB refB = new BBB();
        refB.methodA();
        refB.methodB();

        AAA refA2 = new BBB(); // 컴파일은 AAA , runtime시에는 BBB메모리가 사용됨 >> 객체지향 설계의 핵심
        refA2.methodA();

        AAA refA3 = new AAA();
        refA3.methodA();
    }
}

class AAA {
    public void methodA() { // 해당 메서드A를 주석으로 지워보고나서 >> 집합으로 생각해보기 그냥 속이편함 이해안될때 보기
        System.out.println(" methodA of class A called");
    }
}

class BBB extends AAA {

    // 단순 기능 확장
    public void methodB() {
        System.out.println(" methodB of class B called");
    }

    // 단순 기능 확장
    public void qqqq() {

    }

    // 오버라이딩 할때는 메서드의 안정성을 위해 : 오버라이딩이라고 주석으로 표시해주기
    // 오버라이딩 (오버 로딩과 다름) : 메서드명 같을 때 >> 기능의 확장 :
    // *** 다시생각하기**파라미터로 다른 타입으로 여러가지 변형한 모습을 쓸 수 있음. 지금은 매개변수 없는 메서드와 int 타입 1개 받는
    // 메서드 두개 >> C++ 개념과 구분중 다시 생각하기
    @Override // 실수 방지용 오버라이딩에 관한 컴파일 기능도 있음
    public void methodA() {
        System.out.println("B의 메서드 오버라이딩된 methodA 호출됨");
    }

}
