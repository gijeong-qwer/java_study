public class P13 {
    public static void main(String[] args) {
        // 실무에선 api 로 해결함 // 배열 연산속도가 빨라짐 , 메모리 차지하느 양이 늘어남남
        // 1 ~ 100 사이의 소수를 출력하세요!
        // 에라토스테네스의 체법 - 배열로 푸는법
        boolean[] isPrimes = new boolean[101];
        for (int i = 0; i < isPrimes.length; i++) {
            isPrimes[i] = true;
        }
        // 로직 시작
        for (int x = 2; x < isPrimes.length; x++) {
            if (isPrimes[x]) {
                System.out.println(x + "는 소수입니다.");
                // 체치기 => 거르기
                for (int y = x * x; y < isPrimes.length; y += x) { // 배열이니까 가능한방법
                    isPrimes[y] = false;

                }
            }

        }
    }
}
