public class P3 {
    public static void main(String[] args) {
        // if ~else if ~else >> *** 순차적으로 조건이 제한되는것을 기억 >> 내려갈수록 동작에 제한이 걸림 (당연한것) >> 사실
        // else는 그냥 "위 조건들이 모두 false일 때 실행되는 블록"
        int score = 97; // 0~100 사이라고 가정

        if (score >= 90) {
            System.out.println("A grade ");

        } else if (score >= 80) { // score >= 80 && score <90 이미 위에 if에서 조건을 충족함 >> 위의 if가 false가 되므로 90보다 작은 상황이
                                  // 전제됨됨
            System.out.println("B grade ");
        } else if (score >= 70) { // B와 C 의 조건 순서가 바뀌면 85점 사람이 C가 나오므로 항상 조건을 엄밀하게 고민해야함
            System.out.println("C grade ");
        } else if (score < 70) {
            System.out.println("F 입니다");
        } else { // 안써도됨됨
            System.out.println("성적기입오류");
        }

    }
}
// 1️⃣ if → 첫 번째 조건을 확인하고, true면 실행하고 끝.
// 2️⃣ else if → 앞의 조건이 false일 때만 실행되는 조건.
// 3️⃣ else → 위의 모든 조건이 false일 때 실행되는 기본 처리 블록.