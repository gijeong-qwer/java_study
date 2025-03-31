package p5;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Wrapper Class : - 기본 타입을 지원하기 위한 특수한 목적의 클래스(String)
        // 아주 특수한 목적으로 나온 클래스
        // 우리가 알고있는 클래스 문법과는 다름
        // 불변 객체 (setter가 없다) : 연산시에 Wrapper 클래스를 사용하는것은 피하는 것이 좋다다
        // 가급적 기본타입을 우선 순위로 쓰는게 좋음
        // 단, null 값의 표현이 필요하거나, 자료구조(제네릭) 사용시는 사용될 수 있음

        List<Integer> list = new ArrayList<>(); // Wrapper는 사실 제네릭 때문에 나옴
        list.add(13);
        list.add(17);

        Integer q = 10; // 박싱 boxing >> 좌변에 참조주소값이 들어갈 수 있게 지원해줌
        int y = 10;
        y = q; // 언박싱
        System.out.println(y);
        y = Integer.parseInt("3");
        System.out.println(y);

        int k1 = 1;
        k1++;
        k1++;

        Integer k2 = 1;
        k2++; // 주의
        k2++; // 주의
        k1 += k2; // Java에서 문법적으로 허용해줌
        // 이건 자바에서 자동 박싱이 편하게 보이지만 눈에 안 보이게 불필요한 객체가 계속 만들어지는 구조
        System.out.println(k1);

        byte a1 = 10;
        Byte a2 = 20;
        short b1 = 10;
        Short b2 = 10;
        int c1 = 10;
        Integer c2 = 10;
        long d1 = 10;
        Long d2 = 10L;
        float e1 = 0.1f;
        Float e2 = 0.1f;
        double f1 = 0.1;
        Double f2 = 0.1;
        char g1 = 10;
        Character g2 = 10;
        boolean h1 = true;
        Boolean h2 = true;

        int a = 10;
        // Integer는 참조타입이므로 null 값을 넣을 수 있다
        Integer c = new Integer(10); // 쓰지말라고 막아 놓은것 >> 막은건 아닌데 쓰지 말아달라고 표현현
        Integer b = 10;
    }
}
