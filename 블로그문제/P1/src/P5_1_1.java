public class P5_1_1 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum += i;

            }

        }
        System.out.println(sum);
    }
}
// 더 짧게 응용용