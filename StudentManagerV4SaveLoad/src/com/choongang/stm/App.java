package com.choongang.stm;

import com.choongang.stm.controller.Controller;
import com.choongang.stm.util.IoUtil;

public class App {
    // 제일 먼저 메모리에 올라옴
    // private static String name = IoUtil.input("언제입력되는거지?"); // App이 jvm에 로드 되면서
    // 실행됨
    // 그러나 메서드나 변수는 호출이 없으면 의미가 없는 존재가됨 (main을 제외하고)

    // 이해가 안되는 문법있으면 붙잡고 늘어지기
    // 안보고 코드를 짜보기 >> 막히는부분은 로직이나 문법 메모리 셋중하나임 >> 약점 찾고 기록

    public static void main(String[] args) {
        new Controller().run();
    }
}
