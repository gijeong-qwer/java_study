package p3;

public class App {
    public static void main(String[] args) {
        // 지금부터하는건 문법코드를 줄이는 방법
        // 인터페이스의 참조변수에 값을 담을 수 있는 방법
        // 람다식은 새로운 기능 X, 인터페이스 문법활용을 간결하게 하려는 추가 문법
        // 1. 상속한 클래스 선언 후 인스턴스 생성
        // 2. 익명 객체 사용
        // 3. 람다식

        // 1번 정공법 : 구현해야할 코드의 양이 많을 때
        AAA a1 = new QWER();
        a1.test();

        // 2번 익명 객체 : 안씀
        AAA a2 = new AAA() {
            public void test() {
                System.out.println("우아아아!!");
            }
        };
        a2.test();

        // 3번 람다식 : 가급적 단 한줄인 경우가 좋다 , 변수에다가 함수를 넣고 싶을 때 사용
        // AAA a3 = () -> { // 두줄 이상인 경우면 람다식 사용하는게 맞나 고민
        // System.out.println("으캬캬캬캬");
        // };
        AAA a3 = () -> System.out.println("으캬캬캬컄캬캬");

        a3.test();

    }
}

// 인터페이스에 단 한개의 추상 메서드가 존재하는 경우
interface AAA {
    public void test();
}

class QWER implements AAA {

    @Override
    public void test() {
        System.out.println("야호!!!");
    }
}
