package p2;

public class App {
    public static void main(String[] args) {
        AAA refA = new AAA();
        refA.fieldA1 = 10;

        BBB refB = new BBB();
        refB.fieldB1 = 40;

        CCC refC = new CCC(); // AAA를 상속한 CCC , CCC 만 AAA 까지 확장한것
        refC.fieldA1 = 15;
        refC.fieldA2 = 25;
        refC.fieldC1 = 30;
        refC.fieldC2 = 40;
        refC.methodA();
        refC.methodC();

        System.out.println(refA.fieldA1); // 10 // 같은 fieldA1을 사용하는것같지만 다름
        System.out.println(refC.fieldA1); // 15

        EEE refE = new EEE();

        AAA qwer = new CCC(); // 상속의 다형성
        AAA asdf = new DDD();
        AAA qwr = new EEE();

    }
}

// 명시적으로 Object를 붙이나 빼나 같음 : 그냥 조상 클래스로 지정하는 느낌 다른클래스의 상속을 안받는다
class AAA extends Object { // 모든 클래스는 object라는 클래스를 상속받는다 **** 압도적 중요
    int fieldA1;
    int fieldA2;

    void methodA() {
        System.out.println("A의 메서드 호출됨");
    }

}

class BBB {
    int fieldB1;
    int fieldB2;

    void methodB() {

    }
}

class CCC extends AAA {
    int fieldC1;
    int fieldC2;
    // int fieldA1; // 중복선언 가능하지만 ... 이렇게 코드 짜면 안됨 오버라이딩땐 의미가 있을 수 있어도 , int 타입 메모리
    // 5개 >>

    void methodC() {
        System.out.println("C의 메서드 호출됨");
        this.fieldA1 = 100; // this.fieldA1 = 100; , 중복선언이 아니였으면 부모의 fieldA1을 사용하는것이라 super랑 의미가 같아짐
        super.fieldA1 = 40; // super키워드를 사용하면 부모의 field를 사용할 수 있음
    }
}

class DDD extends AAA {
    int fieldD1;
    int fieldD2;

    void methodD() {
        System.out.println("D의 메서드 호출됨");
    }
}

class EEE extends CCC {
    int fieldE1;
    int fieldE2;

    void methodE() {
        System.out.println("E의 메서드 호출됨");
    }

}