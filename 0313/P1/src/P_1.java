public class P_1 {
    public static void main(String[] args) {
        // 1~100까지의 합을 구해봅시다. 7의 배수만 더하기기

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) { // 예외처리하고싶음 => continue문 써보기기
                sum += i;
            }
        }
        System.out.println("sum: " + sum);
    }
}
// for (int i =0;i<100;i++){
// sum+=(i+1) ;
// }
// for (int i)