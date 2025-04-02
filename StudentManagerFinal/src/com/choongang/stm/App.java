package com.choongang.stm;

import com.choongang.stm.controller.Controller;
import com.choongang.stm.util.IoUtil;

public class App {
    private static String name = IoUtil.input("언제입력되는거지?");

    public static void main(String[] args) {
        new Controller().run();
    }
}
