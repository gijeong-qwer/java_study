public class P_3_1 {
    public static void main(String[] args) {
        // 5개 단위로 나누는 법법
        int product = 0;
        int count = 0;

        for (int i = 2; i < 10; i++) {
            // System.out.println("\n====" + i + "단====");
            for (int j = 1; j < 10; j++) {
                product = i * j;
                System.out.print(i + "X" + j + "=" + product + "\t");

                count++;
                if (count >= 5) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
