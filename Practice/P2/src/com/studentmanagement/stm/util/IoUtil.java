package com.studentmanagement.stm.util;

import java.util.Scanner;

public class IoUtil {

    private static Scanner sc = new Scanner(System.in);

    private IoUtil() {
    }

    // 입력
    public static String input(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    // 출력
    public static void print(String text) {
        System.out.println(text);
    }

    // 멈춤
    public static void pause() {
        System.out.println("넘어가고 싶으시면 Enter를 입력해주세요.");
        sc.nextLine();
    }

}
