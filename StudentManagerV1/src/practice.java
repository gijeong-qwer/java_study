import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nameList = new String[5]; // 저장용 배열 , 값을 받는구조는 따로 할 예쩡
        int[] ageList = new int[5];
        int[] scoreList = new int[5];
        int count = 0;

        while (true) {

            System.out.println("학생관리 프로그램");
            System.out.println("메뉴");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 목록 확인");
            System.out.println("3. 학생 검색");
            System.out.println("4. 학생 정보 수정");
            System.out.println("5. 학생 정보 삭제");
            System.out.println("6. 통계 확인"); // 기능: 성적 평균 , 최고점수 (공동이면 몇명인지)
            System.out.println("0. 프로그램 종료");
            String counter = sc.nextLine();

            if (counter.equals("0")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            if (counter.equals("1")) {
                System.out.print("학생의 이름을 입력해주세요  > ");
                String name = sc.nextLine();
                System.out.print("학생의 나이를 입력해주세요 > ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("학생의 성적을을 입력해주세요 > ");
                int score = Integer.parseInt(sc.nextLine());

                nameList[count] = name;
                ageList[count] = age;
                scoreList[count] = score;
                count++;
            } else if (counter.equals("2")) {
                for (int i = 0; i < count; i++) {
                    System.out.print("학생명 : " + nameList[i]);
                    System.out.print(" 나이 : " + ageList[i]);
                    System.out.println(" 점수 : " + scoreList[i]);
                }

            } else if (counter.equals("3")) {
                System.out.print("찾으시는 학생명을 입력해주세요 > ");
                String searchname = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (nameList[i].equals(searchname)) {
                        System.out.print("학생명 : " + nameList[i]);
                        System.out.print(" 나이 : " + ageList[i]);
                        System.out.println(" 점수 : " + scoreList[i]);
                    }
                }
            } else if (counter.equals("4")) {

            } else if (counter.equals("5")) { // 정보 삭제

            }
            System.out.println("계속하시고 싶으면 Enter를 눌러주세요");
            sc.nextLine();
        }
    }
}
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