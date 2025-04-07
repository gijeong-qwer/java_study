package p6;

public class App {
    public static void main(String[] args) {

        try {
            AAA.test(-26);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("오류지만 어찌됐건... 내가 잡았음");
        }
    }
}

class AAA { // 클래스명이 아닌 메서드명에 throws 붙여야함 **
    public static void test(int value) {
        if (value < 0) {
            throw new AppMinusException();
        }
        System.out.println("흠...." + value);
    }
}

class AppMinusException extends RuntimeException {
}