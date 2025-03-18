import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 학생관리 프로그램
        // 기능 : 정보추가, 목록 ,검색, 수정, 삭제, 통계
        // 데이터 : 한명의 학생은 이름, 나이 , 점수

        // [수업 이후 목표]
        // 1. 코드 이해 및 복습 // ****** 안보고 작성 가능해야 이해한게 맞음!!!!
        // 2. 반복
        // 3. 복기(안보고)
        // 4. 추가 기능(응용)
        // 5. 다른 프로젝트 (기획 및 응용)

        // ! 코드 작성 순서 주의! - 사실 순서는 존재하지 않음
        // 1페이즈: 전체 흐름 코드 작성: 무한 반복, 종료, 분기
        // 2페이즈: 각 기능 구현 기능별 테스트 수행

        System.out.println("***************************");
        System.out.println("*    학생 관리 프로그램   *");
        System.out.println("*      버전: 1.0.0        *");
        System.out.println("*    작성자: 박기정       *");
        System.out.println("***************************");

        while (true) {

            Scanner scanner = new Scanner(System.in);
            // int command = Integer.parseInt(scanner.nextLine());
            String command = scanner.nextLine();

            System.out.println("========= 메뉴 ==========");
            System.out.println("   1. 학생 정보 입력");
            System.out.println("   2. 학생 정보 목록");
            System.out.println("   3. 학생 정보 검색");
            System.out.println("   4. 학생 정보 수정");
            System.out.println("   5. 학생 정보 삭제");
            System.out.println("   6. 학생 정보 통계");
            System.out.println("   0. 프로그램 종료");
            System.out.print("명령 입력 > ");
            scanner.nextLine();

            if (command.equals('0')) {
                break;
            }

        }

    }
}
