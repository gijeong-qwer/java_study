package com.choongang.stm.uitl;

import java.util.*;

// 역할: 입출력
// static 

public class IoUtil { // F2 누르면 관련된게 연쇄적으로 다 바뀜
    private static Scanner scanner = new Scanner(System.in); // static왜 붙였는지 생각해보기 : 이곳저곳 다쓸거니까 > private 붙인이유: 남이 수정
                                                             // 못하게 제한

    private IoUtil() {
    } // IoUtil 사용자들이 무의식적으로 인스턴스 생성 못하게 막음

    public static void print(final String text) { // 자바는 final 키워드가 불편하기 때문에 관례적으로 안씀
        System.out.println(text);
    }

    public static String input(final String prompt) { // 프롬프트를 쓸것임 , 텍스트는 바뀔일이 없으니까 final
        System.out.print(prompt);
        return scanner.nextLine(); // 변수로 받고 해도되긴함
    }

    public static void pause() {
        System.out.println("계속하시려면 Enter를 입력 하세요. ");
        scanner.nextLine();
    }





    
}
