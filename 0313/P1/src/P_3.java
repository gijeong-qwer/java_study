public class P_3 {
    public static void main(String[] args) {
        // 구구단을 출력해보자
        int product = 0;

        for (int i = 1; i < 10; i++) {
            System.out.println("====" + i + "단====");
            for (int j = 1; j < 10; j++) {
                product = i * j;
                System.out.println("  " + i + "X" + j + "=" + product);
            }
        }
    }
}
