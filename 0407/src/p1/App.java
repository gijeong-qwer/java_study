package p1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 예외 처리
        // <좁은의미> 예외를 문법적으로 어떻게 처리할 것인가 ? (문법)
        // 예외를 발생시키는 문법

        // 문법오류는 컴파일 자체가 안됨
        // 버그는 컴파일 뜨는데 >> 그다음뭐더라
        // 예외는 발생한 순간부터 바로 예외처리로 빠지기 때문에 프로그램이 즉시 종료됨

        Scanner scn = new Scanner(System.in);

        System.out.print("점수를 입력하세요 > ");
        String input = scn.nextLine();

        int score = -1;
        try {
            score = Integer.parseInt(input);

            System.out.println("입력받은 점수는 : " + score);
        } catch (Exception e) {// Exception in thread "main" java.lang.NumberFormatException: For input string
            System.out.println("입력된 값을 숫자로 변환하는데 실패했습니다.");
            return;

        } finally {
            System.out.println("제발 문자 입력하지 말아주세요");
            System.out.print("점수를 재입력해주세요 > ");
            System.out.println(scn.nextLine() + "점 입니다. ");
        }
        // 넓은 의미에서 예외처리
        if (score < 0 || score > 100) {
            System.out.println("범위를 벗어났습니다");

        }

        scn.close();
    }
}
