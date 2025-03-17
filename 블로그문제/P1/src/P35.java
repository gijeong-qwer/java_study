import java.util.*;

public class P35 {
    public static void main(String[] args) {
        // 스캐너 입니다 > N 입력받음 ex) 0<= N <=23
        // int n = 7; // 7시라 가정 >> 메소드 생성후 스캐너 구성

        System.out.print("시간을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            n = Integer.parseInt(sc.nextLine());
            if (n > 24 || n < 0) {
                System.out.println("잘못된 입력입니다(0<= N <=23)");
                System.out.print("시간을 입력해주세요 : ");
                // n = Integer.parseInt(sc.nextLine()); 필요없었음음
            } else {
                break;
            }
        }
        // 두번째 자리 조건까지 넣으려면 뭐 쓰지?? >> 시분 동시에 가능하면 초도 가능하니까 시분먼저
        int count = 0;

        for (int i = 0; i <= n; i++) { // i= 시간 // 초기 작성 i == 3 || i == 13 || i == 23
            for (int j = 0; j <= 59; j++) { // j = 분
                for (int k = 0; k <= 59; k++) { // k = 초초
                    if (i == 3 || i == 13 || i == 23) { // 이거일때 걍 count 확정짓고 continue 넣기
                        count = count + 3600;
                        break;
                    } else if (j % 10 == 3 || j / 10 == 3) {
                        count = count + 60;
                        break;
                    } else if (k % 10 == 3 || k / 10 == 3) {
                        count++;
                    }
                }
            }
        }
        System.out.println("0시0분0초부터 " + n + "시59분59초까지 3이나온 횟수는" + count + "번 입니다");
    }

}
// Q.시각
// • 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는
// 모든 경우의 수를 구하는 프로그램을 작성하세요. 예를 들어 1을 입력했을 때 다음은 3이 하나라도 포함되
// 어 있으므로 세어야 하는 시각입니다.
// • 00시 00분 03초
// • 00시 13분 30초
// • 반면에 다음은 3이 하나도 포함되어 있지 않으므로 세면 안 되는 시각입니다.
// • 00시 02분 55초
// • 01시 27분 45초
// [출처] 목표|작성자 s001lec

// 1. 스캐너 사용 해서 입력받기
// 2. 1의자릿수 == 3인 경우 , n/10 == 3인경우 로확장
// 3. 3의 배수는 당연히 세는거 아님
// < gpt 추천 스캐너 방식 >
// System.out.print("시간을 입력해주세요 : ");
// Scanner sc = new Scanner(System.in);
// int n;

// while (true) {
// n = Integer.parseInt(sc.nextLine());

// if (n >= 0 && n <= 23) { // ✅ 올바른 범위라면 `break`로 루프 종료
// break;
// }

// System.out.println("잘못된 입력입니다(0<= N <=23)");
// System.out.print("시간을 입력해주세요 : "); // ✅ 잘못된 입력일 때만 다시 메시지 출력
// }