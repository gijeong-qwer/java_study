public class P5 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 201; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                continue;
            }

            sum += i;

        }
        System.out.println("2 또는 3의 배수가 아닌 수의 총합은 " + sum + " 입니다.");
    }
}
// 1부터 200까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
// [출처] 목표|작성자 s001lec
// 불필요하게 continue를 쓴 구문문