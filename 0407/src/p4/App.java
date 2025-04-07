package p4;

public class App {
    public static void main(String[] args) {
        // exception 발생 시키기
        try {
            new AAA().method1(-3);
        } catch (Exception e) {

        }

    }
}

class AAA { // throws IllegalArgumentException, IndexOutOfBoundsException
    public void method1(int value) throws Exception {
        if (value < 0) {
            throw new IllegalArgumentException(); // Exception을 발생시키겠다 ("쓰고싶은말") 넣으면 getMessage()로 꺼낼 수 있음
            // try - catch를 꼭 써줘야함 : throw로 던졌으니 catch로 잡아줘야함

            // System.out.println("value는 음수의 값이 될 수 없습니다");
            // return;
        }

        if (value % 2 == 0) {
            throw new IndexOutOfBoundsException();
        }
        System.out.println("value의 값: " + value);

    }

}

// 커스텀으로 Exception 처리하고 준비할 수 있다
class AppMinusValueException extends Exception {
}

class AppEvenValueException extends Exception {
}
