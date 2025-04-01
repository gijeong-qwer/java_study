package com.gijeongpractice.util;

import java.util.Scanner;

public class IoUtil {
    // 유틸은 인스턴스 생성없이 사용을 의도해야함
    // 메서드들 static으로 전역메서드처럼 사용할것

    // 메서드명이 아닌 변수에 static >> 클래스 변수 , 한번이라도 사용시 메서드영역에 할당됨
    // 뭔가 낯설음
    private static Scanner sc = new Scanner(System.in);

    // 생성자 - 인스턴스 생성 막기
    private IoUtil() {

    }

    // 입력 ver. 프롬프트
    // 입력에 대한 함수는 입력값을 받아와야하기 때문에
    // return으로 받지 않으면 쓸 수 강벗음음
    public static String input(String prompt) {
        System.out.print(prompt);

        return sc.nextLine();
    }

    public static void printt(String text) {
        System.out.print(text);
    }

    // 입력
    public static String input() {
        return sc.nextLine();
    }

    // 출력 , println print 구분해서 만들 수 있지만
    // 이번프로젝트는 print안써서 입력편하게하기위해서 이렇게 받음
    public static void print(String text) {
        System.out.println(text);
    }

    //
    public static void pause() {
        System.out.println("메뉴를 보고싶으시면 Enter를 눌러주세요 ");
        sc.nextLine();
    }

    // 스캐너 닫기기
    public static void close() {
        sc.close();
    }

}
