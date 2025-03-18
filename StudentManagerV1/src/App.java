import java.util.*; //패키지 나올때 배움

public class App {
    public static void main(String[] args) throws Exception {
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

        Scanner scanner = new Scanner(System.in);
        String[] nameList = new String[5];
        int[] ageList = new int[5];
        int[] scoreList = new int[5];
        int count = 0;

        // int[][] data = new int[5][2]; 이건 논리적으론 가능하지만 설계에서 잘못됨

        System.out.println("***************************");
        System.out.println("*    학생 관리 프로그램   *");
        System.out.println("*      버전: 1.0.0        *");
        System.out.println("*    작성자: 박기정       *");
        System.out.println("***************************");
        while (true) {
            System.out.println("========= 메뉴 ==========");
            System.out.println("   1. 학생 정보 입력");
            System.out.println("   2. 학생 정보 목록");
            System.out.println("   3. 학생 정보 검색");
            System.out.println("   4. 학생 정보 수정");
            System.out.println("   5. 학생 정보 삭제");
            System.out.println("   6. 학생 정보 통계");
            System.out.println("   0. 프로그램 종료"); // if 문 안에 넣어되지만 예외느낌이라 따로처리하는게 깔끔
            System.out.print("명령 입력 > ");
            String command = scanner.nextLine(); // 내부적으로 new string한것이라 equals로 해야함 거의 원칙임

            if (command.equals("0")) { // command == "0" 쓰면 안됨
                break; // 0 일때만 종료하는 거라 로직적으로 else if 에 넣어되지만 가시성때문에 따로 빼놓음
            }

            if (command.equals("1")) {
                // todo: 학생정보 등록 로직
                System.out.println("[학생 정보 등록]");
                System.out.print("이름 입력 > ");
                String name = scanner.nextLine();
                System.out.print("나이 입력 > ");
                int age = Integer.parseInt(scanner.nextLine()); //
                System.out.print("점수 입력 > ");
                int score = Integer.parseInt(scanner.nextLine());

                // 마지막에 이해할 것
                if (count == nameList.length) { // 배열의 크기가 다차면 새로 배열 만들고 그전배열 복사하는 함수 // stack overflow
                    String[] newNameList = new String[nameList.length * 2];
                    for (int i = 0; i < nameList.length; i++) { // 길이는 count로 해도 같긴함
                        newNameList[i] = nameList[i]; // 복사
                    }
                    nameList = newNameList; // **** 핵심 :newNameList의 공간을 nameList와 공유하면서 기존 nameList공간을 없앰
                    // 종료시 newNameList는 소멸

                    int[] newAgeList = new int[ageList.length * 2];
                    for (int i = 0; i < ageList.length; i++) { // 길이는 count로 해도 같긴함
                        newAgeList[i] = ageList[i]; // 복사
                    }
                    ageList = newAgeList; // **** 핵심 :newNameList의 공간을 nameList와 공유하면서 기존 nameList공간을 없앰
                    // 종료시 newAgeList는 소멸

                    int[] newScoreList = new int[scoreList.length * 2];
                    for (int i = 0; i < scoreList.length; i++) { // 길이는 count로 해도 같긴함
                        newScoreList[i] = scoreList[i]; // 복사
                    }
                    scoreList = newScoreList; // **** 핵심 :newNameList의 공간을 nameList와 공유하면서 기존 nameList공간을 없앰
                    // 종료시 newScoreList는 소멸
                }
                nameList[count] = name;
                ageList[count] = age;
                scoreList[count] = score;
                count++;

                System.out.println("학생이 등록되었습니다.");

                // String input = scanner.nextLine(); >>> 참고용
                // for(char e: input.toCharArray()){
                // if(e>= '0' && e<='9'){

                // }
                // }

            } else if (command.equals("2")) {
                // todo: 학생정보 목록 출력 로직
                System.out.println("[학생 목록]");
                for (int i = 0; i < count; i++) {// 배열은 꽉차있을때만 쓰는게 몸에 배어있음 개발자들은 , 아닌경우는 리스트트
                    String text = "";
                    text += "이름: " + nameList[i];
                    text += ", 나이: " + ageList[i];
                    text += ", 점수: " + scoreList[i];
                    System.out.println(text);

                }
                System.err.println("총 " + count + "명이 존재합니다.");
            } else if (command.equals("3")) {
                // todo: 학생정보 검색 로직
                System.out.println("[학생 검색]");
                System.out.print("검색어 입력 >");
                String searchWord = scanner.nextLine();

                int searchCount = 0;
                for (int i = 0; i < count; i++) {
                    if (nameList[i].contains(searchWord)) { // String >> contains return타입이 boolean , equals return타입이
                                                            // boolean // contains 안쓰고 풀어보기

                        String text = "";
                        text += "이름: " + nameList[i];
                        text += ", 나이: " + ageList[i];
                        text += ", 점수: " + scoreList[i];
                        System.out.println(text);
                        searchCount++;

                    }
                }
                System.out.println("총" + searchCount + "이 존재합니다"); // 총 몇명이 검색되었습니다를 if 문에서 맨위로 올리려고하면 어려움
            } else if (command.equals("4")) {
                // todo: 학생정보 수정 로직

            } else if (command.equals("5")) { // 순수한 배열의 단점 - 삽입 및 삭제가 어려움
                // todo: 학생정보 삭제 로직
                System.out.println("[학생 정보 삭제]");
                System.out.print("삭제할 학생의 이름 >");
                String deleteName = scanner.nextLine();

                for (int i = 0; i < count; i++) {
                    if (nameList[i].equals(deleteName)) { // 연속으로 두개이상 있을때 안됨됨
                        for (int x = i; x < count - 1; x++) { // 밑의 x+1 때문에 -1 안하면 범위를 벗어나게됨
                            nameList[x] = nameList[x + 1]; // 삭제후 배열을 한칸씩 옆으로 밀어 넣는것
                            ageList[x] = ageList[x + 1];
                            scoreList[x] = scoreList[x + 1];

                        }
                        count--;
                        i--; // **** 디테일 잘 모르겠음음
                    }
                }
            } else if (command.equals("6")) {
                // todo: 학생 정보 통계
            } else {
                System.out.println("잘못된 명령을 입력하셨습니다. 다시 입력해주세요"); // 0은 break로 이미 탈출했으므로 상관없음
            }

            System.out.println("계속하시려면 enter를 입력해주세요.");
            scanner.nextLine(); // enter용으로 걸어 놓는정도 , 문법적으로 문자열을 안받아도됨

        }

        System.out.println("이용해주셔서 감사합니다.");
        System.out.println("프로그램을 종료합니다.");
        scanner.close();

    }
}
