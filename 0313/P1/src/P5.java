import java.util.*; // 스캐너 입력을 위한 것 import도 함수 , import는 scanner 클래스를 가져옴옴
// 수업은 프로그래밍에 집중중

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // new로 힙에 객체 생성 Scanner는 외부에서 입력을 받아야 하는 클래스이기 때문에,
        // 입력 스트림(키보드, 파일 등)을 지정해야 동작함! System.in은 **표준 입력 스트림(키보드 입력)**을 의미함.
        System.out.println("통화 상담 프로그램을 시작합니다.");
        System.out.println("[메뉴]");
        System.out.println("1. 상담사와 통화");
        System.out.println("2. 결재내역 확인");
        System.out.println("3. .....");
        System.out.print("입력 > ");
        // scanner.nextLine(); // "문자열"로 값을 받음 >> 1입력시 문자 1임
        String inputValue = scanner.nextLine();

        int command = Integer.parseInt(inputValue); // "문자열"을 정수로 바꿔줌 >> 문자를 쓰면 exception input string이 나옴
        // nextInt가 쓰고싶으면 찾아보고 공부하기 -> 수업중엔 안씀씀
        // System.out.println();

        // 1. 메모리를 확인하는목적 (테스트코드)
        // 2. 코드의 로직을 다 만들 수 없을때 , 대충 때우려고
        if (command == 1) {
            System.out.println("상담사와 통화하는 로직...");
        } else if (command == 2) {
            System.out.println("결재내역 확인...");
        } else { // 일반적으로 else는 예외 상황 ,문제 발생에 관하여 작성함
            System.out.println("잘못 번호를 입력하셨습니다.");
        }

        scanner.close();

    }
}
