package p5;

public class App {
    public static void main(String[] args) {
        // 자바의 꽃 인터페이스
        BBB ref = null;
    }
}

// 인터페이스 추상화의 끝!  - 인터페이스 안에는 구현이 불가함 !!!!>> 다 추상임
interface BBB{
    int a = 10; // 인스턴스변수가 아니라 public static임 !!!! 멤버변수 조차 추상화시킴
    public static int b = 20;

    // abstact 메서드만 선언할 수 있다 , private 허용 안됨 ***  *** 책보고 생각하기
    public abstract void method1();
    public abstract void method2();
    public void method3(); // abstract를 안써도 abstract임  >>> 개발자들 극선호 표현 다 같은 표현이지만 
    void method4(); // public도 자동으로 붙음음
}


// implements  BBB의 인터페이스를 구현하겠다 >> interface를 받을때 사용하는 키워드 
class QWER implements BBB{  //인터페이스는 여러개 받을 수 있다 implements BBB, CCC 이런식으로 

    public void method1(){

    }
    public void method2(){
        
    }
    public void method3(){
        
    }
    public void method4(){
        
    }
}

// 추상 클래스는 선택적 추상화 가능
abstract class AAA {
    public void t1(){

    }
    // 일반클래스에는 abstract 사용 못함
    public abstract void t2();
}

// 일반클래스에는 abstract 사용 못함 
// class TTT{
//     public abstract void tt();
// }