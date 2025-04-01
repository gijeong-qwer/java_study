package p1.util;

import java.util.Scanner;

public class IoUtil {

    private static Scanner sc = new Scanner(System.in);

    private IoUtil() { // Util 클래스는 사람들이 인스턴스 생성 못하게 막아 놔야함

    }

    // 입력 (프롬프트)
    public static String input(final String prompt) { // 입력부분 세번절음
        // Scanner sc = new Scanner(System.in); // 전역함수 처리하면 더 편함
        System.out.print(prompt);

        return sc.nextLine();

    }

    // 입력
    public static String input() { // return 꼭 받아야하나?
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void inputxx() { // 얘가 Pause랑 뭔차이지 흠... >> 입력값을 꺼내올 수 있는 방법은 private한 변수에 대해 가져오는거 말곤없는데
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    // 출력 (print 만들어도 되는데 이번 프로젝트는 없는게 편해서 뺐음)
    public static void print(String input) {
        System.out.println(input);
    }

    public static void pause() {
        // Scanner sc = new Scanner(System.in); 전역함수처리해서 안써도됨됨

        System.out.println("메뉴 확인을 위해 Enter를 눌러주세요 ");
        sc.nextLine();
    }
}
