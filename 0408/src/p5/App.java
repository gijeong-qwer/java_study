package p5;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        AAA a1 = new AAA();
        AAA a2 = new AAA();

        a1.start();
        a2.start();

        a1.join();
        a2.join();

        System.out.println(SomeData.list.size());
    }
}

class SomeData { // 동기화가 처리되어있는 ArrayList임 : Vector >> 다 Synchronized를 사용했음
                 // 동기화 되어있는건 속도가 떨어질 수 밖에 없음 (API 속도가 떨어짐)

    public static List<String> list = new Vector<>();
}

class AAA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            SomeData.list.add("한조" + i);
        }
    }
}