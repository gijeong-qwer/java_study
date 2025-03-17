public class P3 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int sum = 0; // int sum = i*j;로 하는게 더 깔끔
                sum = i * j;
                System.out.println(i + "X" + j + "=" + sum);
            }
        }
    }
}
// 구구단을 출력해보자