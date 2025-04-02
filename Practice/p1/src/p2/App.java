package p2;

public class App {

    public static void validateAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("나이는 0 ~ 150세 사이여야 합니다.");
        }
        System.out.println("나이 유효성 통과: " + age);
    }

    public static void main(String[] args) {
        System.out.println("== 프로그램 시작 ==");

        try {
            System.out.println(">> 나이 검증 시작");
            validateAge(-5); // 예외 발생 예상 지점
            System.out.println(">> 이 메시지는 예외 없을 때만 출력됨");

        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());

        } finally {
            System.out.println(">> finally 블록: 예외 발생 여부와 무관하게 항상 실행");
        }

        System.out.println("== 프로그램 종료 ==");
    }
}