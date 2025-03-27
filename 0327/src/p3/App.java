package p3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 다형성 (polymorphism) : 다양한 형태를 띄고있다
        // 지금부터는 문법규칙과 runtime이 똑같이 않을 수 있다
        // 의존도를 낮추는 표현

        Object obj = new String(); // Object는 모든 타입의 최상위 이기 때문에 이렇게 선언할 수 있지만
        // 쓸수가 없음
        Object objsc = new Scanner(System.in);
        Object aaa111 = 333; // 참조타입이지만 기본타입도 받을 수 있음 .. ㄷㄷ??
        Object a13 = "asdf";
        Object a15 = true;

        System.out.println(aaa111);

        AAA refA = new AAA();
        // AAA refA = (AAA)new BBB(); 타입캐스팅 그냥 안됨
        BBB refB = new BBB(); // refB가 쓸 수 있는 필드는 4개

        // 앞으로 참조변수 AAA 에 들어오는것은 AAA라고 확신할 수 없다 (읽을떄 기준) , 상속 받은 클래스 일 수 있음음
        AAA refQQ = new BBB(); // 다형성 문법 >> 이런것도 프로모션 : 작을걸 더 큰곳에 담을 수 있음 >> AAA의 자손들은 AAA의 특성을 갖고있기 때문에 가능
        // 반대의 논리는 문법적으로는 가능하지만 runtime시에 발생하는 오류
        refQQ.fieldA1 = 10; // refQQ.fieldB1 = 10; 문법적오류 ***** , runtime시에는 fieldB1이 있음!! 따라서 쓸 수 없음
        refQQ.methodA();

        if (refQQ instanceof BBB) { // 연산자 : 참조변수 instanceof 클래스명 >> 이참조변수가 진짜 해당 클래스의 하위 혹은 해당 클래스야??
            // 개발자가 100% 타입을 아는경우 >> runtime시에 작동하는 if문문
            BBB refWW = (BBB) refQQ;
            refWW.fieldB1 = 10;

        }
        // BBB refWW = refQQ; 이건 안됨 더큰걸 BBB에 담으려고 해서

        // runtime시 메모리는 BBB 이고 refQQ의 참조타입이 AAA 이므로 오류가 생겼던거임!!!
        BBB refWW = (BBB) refQQ; // 캐스팅 // 컴파일러는 문법은 참조타입만 따라감 ****
        refWW.fieldB1 = 10; // runtime시에는 메모리만 따라감 *****

        // 문법적으로 다형성은 refQQ 변수를 의미하고 변수에 들어가는 형태는 다양하게 들어갈 수 있다는것 (자신의 자식도 넣을 수 있다)
        // AAA를 상속받은 모든 클래스를 인스턴스로 만들 수 있다
        // 따라서 참조변수는 다형성을 띈다 ****
        // refQQ가 쓸 수 있는 필드는 2개

        // BBB refYY = new AAA();
        // refYY.fieldB1 = 10; // 런타임시에 BBB가 메모리에 없으므로 오류 생김

        BBB refYY = (BBB) new AAA();// Exception in thread "main" java.lang.ClassCastException:
        // class p3.AAA cannot be cast to class p3.BBB (p3.AAA and p3.BBB are in unnamed
        // module of loader 'app')at p3.App.main(App.java:30)
        // runtime 시에 오류가 발생 >> 없는걸 케스팅해서 접근하려고 생긴문제 **** AI로 다시 확인 내가 제대로 알고있나나
        refYY.fieldB1 = 10;

        // 캐스팅 가능한 경우와 간단하게 비교하면서 생각
        int aaa = (int) 1L;
        int bbb = (int) 3411241231251515155L;
        long ccc = 1234234;

    }
}

class AAA {
    int fieldA1;
    int fieldA2;

    void methodA() {
        System.out.println("A의 메서드 호출됨");
    }

}

class BBB extends AAA {
    int fieldB1;
    int fieldB2;

    void methodB() {

    }
}

class CCC extends AAA {
    int fieldC1;
    int fieldC2;

    void methodC() {
        System.out.println("C의 메서드 호출됨");
        this.fieldA1 = 100;
        super.fieldA1 = 40;
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