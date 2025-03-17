public class P5_1 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
// 1부터 200까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
// if (i % 2 == 0 || i % 3 == 0) {
// } else {
// sum += i;
// } >> 이거 변환
// if (!(i % 2 == 0 || i % 3 == 0)) {
// sum += i;
// }

// for (int i = 1; i <= 200; i++) {
// if (i % 2 == 0 || i % 3 == 0) {
// continue;
// }
// sum+=i;
// }