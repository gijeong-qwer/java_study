public class P6 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 200; i++) {
            if (i % 2 == 0) {
                // i = -i;
                // sum += i;
                // i = -i;
                sum -= i;
            } else {
                sum += i;

            }

        }
        System.out.println(sum);
    }
}
// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
// [출처] 목표|작성자 s001lec
