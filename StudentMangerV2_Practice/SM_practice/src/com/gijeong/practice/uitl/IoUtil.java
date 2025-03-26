package com.gijeong.practice.uitl;

import java.util.Scanner;

// 입출력을 받을거임
public class IoUtil {
    private static Scanner sc = new Scanner(System.in);

    private IoUtil() {
    } // 생성자를 private함으로써 IoUtil 클래스는 인스턴스 생성하지 않고 사용한다고 명시적으로 표현함함

    // 출력
    public static void print(String text) { // private 쓰면 다른 클래스에서 사용할 수 가 없음
        System.out.print(text); // static을 써서 객체 생성없이 사용 가능하게 만듦듦
    }

    public static void println(String text) {
        System.out.println(text);
    }

    // 입력
    public static String input(String prompt) { // 스캐너 써야겠지 , // 잘못한 발상 static 쓰면 안됨 >> 입력받을때만 사용해야하기 때문에
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static void pause() {
        System.out.println("계속하시려면 ENTER을 입력해주세요 .");
        sc.nextLine();
    }

}
// 잘못한 발상 static 쓰면 안됨 >> 입력받을때만 사용해야하기 때문에 public static String input() 메서드에 대해
// 잘못생각했음

// 입력받을때만 사용하게 만들려고 static을 때면 입력할때마다 new 사용해야해서 더 번거로워짐 따라서 static을 써야함