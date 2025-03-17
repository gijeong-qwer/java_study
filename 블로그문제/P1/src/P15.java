public class P15 {
    public static void main(String[] args) {
        int sum = 0;
        // int minSum = 0;
        for (int i = 1; i <= 10; i++) {
            int minSum = 0;
            for (int j = 1; j <= i; j++) {
                // int minSum = 0;

                // minSum += i;
                minSum += j;
                // sum += minSum;
            }
            sum += minSum;
        }
        System.out.println(sum);
    }
}
// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
// [출처] 목표|작성자 s001lec
