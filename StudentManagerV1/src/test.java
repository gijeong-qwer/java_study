import java.util.*;;

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

        Scanner scanner = new Scanner(System.in);
        String[] nameList = new String[5];
        int[] ageList = new int[5];
        int[] scoreList = new int[5];
        int count = 0;
        int totalDelete = 0;

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
            System.out.println("   0. 프로그램 종료");
            System.out.print("명령 입력 > ");

            // int command = Integer.parseInt(scanner.nextLine());
            String command = scanner.nextLine();

            if (command.equals("0")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            if (command.equals("1")) { // 이름 나이 점수 ***** 막힌부분 다시 구현하기기

                System.out.println("학생정보를 입력하세요");
                System.out.print("학생의 이름은? >");
                String name = scanner.nextLine();
                System.out.print("학생의 나이는? >");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("학생의 점수는? >");
                int score = Integer.parseInt(scanner.nextLine());
                if (count == nameList.length) {
                    String[] replace = new String[nameList.length * 2];
                    for (int i = 0; i < nameList.length; i++) {
                        replace[i] = nameList[i];
                    }
                    nameList = replace;
                    int[] replace_score = new int[scoreList.length * 2];
                    for (int i = 0; i < scoreList.length; i++) {
                        replace_score[i] = scoreList[i];
                    }
                    scoreList = replace_score;
                    int[] replace_age = new int[ageList.length * 2];
                    for (int i = 0; i < ageList.length; i++) {
                        replace_age[i] = ageList[i];
                    }
                    ageList = replace_age;

                }
                scoreList[count] = score;
                nameList[count] = name;
                ageList[count] = age;
                count++;

            } else if (command.equals("2")) {
                for (int i = 0; i < count; i++) { // 배열의 길이로 하면 남는값이 null로 나옴
                    System.out.print("학생의 이름은 " + nameList[i]);
                    System.out.print(",  나이는 " + ageList[i]);
                    System.out.println(", 성적은 " + scoreList[i] + "입니다.");
                }

            } else if (command.equals("3")) {// System.out.println(" 3. 학생 정보 검색");
                // 정보를 검색하려면 스캐너가 있어야함
                System.out.println("검색할 학생의 이름을 입력하세요");
                String search = scanner.nextLine();

                for (int i = 0; i < count; i++) {
                    if (nameList[i].contains(search)) { // 좌변이 우변을 포함하고있는가 좌변의 영역에서 우변과 겹치는거 하나라도 찾기
                        String text = "";
                        text += "이름 : " + nameList[i];
                        text += " , 나이 : " + ageList[i];
                        text += " , 점수 : " + scoreList[i];
                        System.out.println(text);

                    }
                }

            } else if (command.equals("4")) { //

            } else if (command.equals("5")) { // 삭제할 배열을 한칸씩 옆으로 밀기기
                System.out.println("삭제할 학생의 정보를 입력하세요");

                String deleteList = scanner.nextLine(); // 배열로 받을 필요 없음
                for (int i = 0; i < count; i++) {
                    if (nameList[i].equals(deleteList)) { // 한칸씩 밀어넣기 String
                        System.out.println(nameList[i] + "의 정보는 삭제되었습니다");
                        for (int j = 0; j < count - 1; j++) {

                            nameList[j] = nameList[j + 1];
                            ageList[j] = ageList[j + 1];
                            scoreList[j] = scoreList[j + 1];
                        } // 배열 한칸씩 밀기
                        count--; // 한명의 데이터 삭제
                        i--; // 삭제시 해당 새로 들어온 첫배열 검사가 안됨 >> i--넣기
                        totalDelete++;
                        System.out.println("총 삭제한 인원수는" + totalDelete + " 입니다.");
                    }

                }

            } else if (command.equals("6")) {//

            }
            System.out.println("Enter를 누르고 시작하십시오.");
            scanner.nextLine();

        }

        scanner.close();

    }
}
