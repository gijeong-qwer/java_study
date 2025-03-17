public class P7 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // ✅ 1부터 시작

        while (sum < 100) { // ✅ 총합이 100 이상이 될 때까지 반복
            if (i % 2 == 0) {
                sum -= i; // ✅ 짝수는 음수로 더하기
            } else {
                sum += i; // ✅ 홀수는 그대로 더하기
            }
            i++; // ✅ 직접 `i` 값을 증가시켜야 다음 숫자로 넘어감
        }

        System.out.println("100 이상이 되는 최소 숫자: " + (i - 1));
        System.out.println("총합: " + sum);
    }
}
