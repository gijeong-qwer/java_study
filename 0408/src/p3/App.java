package p3;

public class App {
    public static void main(String[] args) {

        // 프로그램의 끝 : 프로그램에서 생성된 모든 스레드가 종료되어야 끝남

        // 비동기식 코드
        // int sum = 0;

        // // sum 출력하고 나서 구구단 출력 >> 동기식 (코드의 흐름이 잡혀있다)
        // // 프로그래밍에서 “동기식”이란? 동기식(synchronous) 작업의 실행 순서에 대한 개념. 순차 처리.
        // // 작업(명령)이 순서대로, 앞의 작업이 끝나야 다음으로 넘어가는 처리 방식
        // // Multi Thread를 하여 비동기식으로 프로그래밍을 해볼것임

        // for (int i = 1; i <= 500; i++) {
        // sum += i;
        // System.out.println("현재 i: " + i + ", sum:" + sum);
        // }
        // System.out.println(sum);

        // for (int x = 2; x <= 20; x++) {
        // for (int y = 1; y <= 9; y++) {
        // System.out.println(x + "X" + y + "=" + x * y);
        // }
        // }
        AAA a = new AAA();
        a.start(); // 쓰레드[흐름] 생성 후 run 실행
        AAA a2 = new AAA();
        a2.start(); // 쓰레드[흐름] 생성 후 run 실행

        BBB b = new BBB();
        b.start(); // 쓰레드[흐름] 생성 후 run 실행

        System.out.println("main 스레드 끝");

        Thread c = new Thread(new CCC());
        c.start();

        // 요즘에는 람다식 이렇게도 잘 안씀
        new Thread(() -> {
            // ...
        }).start();

    }
}

// 스레드 ... 정의 ??
class AAA extends Thread {
    @Override
    public void run() { // 파라미터없고 void임
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println("현재 i: " + i + ", sum:" + sum);
        }
        System.out.println(sum);
        System.out.println("AAA스레드 끝");

    }
}

class BBB extends Thread {
    @Override
    public void run() {
        for (int x = 2; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                System.out.println(x + "X" + y + "=" + x * y);
            }
        }
        System.out.println("BBB스레드 끝");
    }
}

// Runnable interface를 상속 ,추상클래스고 abstract 메서드가 한개인데 자동적으로 람다식이 나와야한다는데 왜지?
class CCC implements Runnable { // Thread로 돌릴 수 있는 코드를 작성 할 수 있음
    @Override
    public void run() {
        // ...
    }
}