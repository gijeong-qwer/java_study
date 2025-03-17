public class P16 {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 0) {
                        int sum = 0;
                        sum = i * j;
                        System.out.println(i + "X" + j + "=" + sum);

                    }
                }
            }
        }
    }
}

// 구구단의 짝수 단(2, 4, 6, 8단)만 출력하는 프로그램을 작성하되,
// 2단은 2X2까지, 4단은 4X4까지, 6단은 6X6까지 8단은 8X8까지만 출력하도록 구현하자.
// [출처] 목표|작성자 s001lec
// public class P16 {
// public static void main(String[] args) {
// for (int i = 2; i <= 8; i += 2) { // ✅ 짝수 단(2, 4, 6, 8)만 반복
// for (int j = 2; j <= i; j += 2) { // ✅ 2부터 i까지 짝수만 반복
// System.out.println(i + "X" + j + "=" + (i * j)); // ✅ sum 변수 제거
// }
// }
// }
// }
