public class P4 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i % 6 == 0 || i % 7 == 0) {
                    continue;
                }
                int product = i * j;
                System.out.println(i + "X" + j + "=" + product);
            }
        }
    }
}
// 구구단을 출력을 하되 7단과 6단을 제외하고 출력하자.
// [출처] 목표|작성자 s001lec
// public class P4 {
// public static void main(String[] args) {
// for (int i = 2; i < 10; i++) {
// if (i % 6 == 0 || i % 7 == 0) { // ✅ 6단, 7단 제외
// // ✅ continue 대신 바로 다음 반복으로 넘어감
// } else {
// for (int j = 1; j < 10; j++) {
// int product = i * j;
// System.out.println(i + "X" + j + "=" + product);
// }
// }
// }
// }
// }
