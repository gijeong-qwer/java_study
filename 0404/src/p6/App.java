package p6;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random1 = new Random();
        System.out.println(random1.nextInt(100)); // 0~100 까지의 값
        System.out.println(random1.nextInt(100));
        System.out.println(random1.nextInt(100));
        System.out.println(random1.nextInt(100));
        System.out.println(random1.nextInt(100));
        System.out.println(random1.nextInt(100));
        System.out.println(random1.nextDouble(100));
        System.out.println(random1.hashCode());

    }
}
