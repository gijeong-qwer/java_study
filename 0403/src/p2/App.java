package p2;

public class App {
    public static void main(String[] args) {
        // 람다식

        // 절차형 프로그래밍 기법 (고전...)
        // 객체 지향 프로그래밍 기법(Java)
        // 함수형 프로그래밍 기법(최신 트렌드) >> 코드가 간결해짐

        int a = 10;

        AAA aaa = new AAAImpl();

        aaa.test1();
        aaa.test2();

        // 너무 간단한데 클래스 내부에서 정의하기 싫을때
        // 익명 객체를 생성하는 문법 : 클래스 명이 없다
        // 익명 객체 - 사용안함 ( 가독성이 안좋아서 사장됨 )
        // 목적: 1회성의 가벼운 코드를 굳이 클래스선언까지 가야하는가?
        AAA aaa2 = new AAA() { // AAA는 클래스명이 아님 >> AAA가 아니여도 AAA를 상속받은 클래스(오른쪽 AAA말하는거 )로도 이용가능
            // 메서드 내에서만 쓰려고 만든 임시문법
            //
            private int aaa = 10;

            public void test1() {
                System.out.println("안녕!!");
            }

            public void test2() {
                System.out.println("반가워~");
            }

        }; // aaa2는 AAA에 해당 혹은 상속받은 인스턴스만 받을 수 있음

    }
}

interface AAA {
    public void test1();

    public void test2();
}

class AAAImpl implements AAA {
    @Override
    public void test1() {
        // 한두줄
    }

    @Override
    public void test2() {
        // 한줄..
    }
}