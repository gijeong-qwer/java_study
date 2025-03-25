package com.choongang.stm;

import com.choongang.stm.controller.Controller;

public class App {
    public static void main(String[] args) { // main을 갖고 코드를 짜는건 사실상 설계오류 그냥시작점
        // Controller controller = new Controller(); // Controller 자동완성 때문에 import되는거
        // 집중해서 보기
        // controller.run();
        new Controller().run(); // 실행하자마자 끝내라

    }
}
