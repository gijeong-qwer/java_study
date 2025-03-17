public class P6_1 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1; // ✅ 1부터 시작

        while (sum < 100) { // ✅ 100 이상이 될 때까지 반복
            sum += (i % 2 == 0) ? -i : i; // ✅ 짝수는 빼고, 홀수는 더하기
            i++; // ✅ 숫자 증가
        }

        System.out.println("100 이상이 되는 최소 숫자: " + i); // ✅ 정답: 200
        System.out.println("총합: " + sum);
    }

}
// int sum = 0;
// while (sum == 200) {
// for (int i = 1; i < 100; i++) {
// if (i % 2 == 0) {
// i = -i;
// }
// sum += i;
// }
// }
// System.out.println(sum);
// }

// 1 -2 3 -4 while문으로 생각
// 몇까지 더해야하냐냐