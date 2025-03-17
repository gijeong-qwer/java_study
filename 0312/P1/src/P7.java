public class P7 {
    public static void main(String[] args) {
        // 연산자 우선순위 신경쓰기 + 걍 괄호 쓰기기 >> &,| 비트연산에서 사용 &&,|| 논리연산산
        int score = 1000; // 점수
        int atdrate = 10000; // 출석률
        int vlt = 0; // 봉사활동동

        if (score >= 90 && atdrate >= 80 || vlt == 100) { // 비교연산자는 동등 논리연산자보다 우선순위가 낮음
            // 각 숫자에 대해 비교를 먼저함 이후 논리 연산
            System.out.println("장학금을 받습니다!");
        } else {
            System.out.println("정진하세요");
        }

    }
}
// if(vlt == 100 || (score>=90&& adtrate >=80)) //괄호처리해서 우선순위정리리