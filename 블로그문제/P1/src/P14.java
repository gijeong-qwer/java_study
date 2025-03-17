public class P14 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 1;
        while (sum <= 1000) {
            if (i % 2 == 1 || i % 3 == 0 && i % 2 == 0) {
                count = i;
                sum += i;

            }
            i++;
        }

        System.out.println(count);
        System.out.println(sum);
    }
}
// 자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다.
// 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지 , 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해
// 보자.
// [출처] 목표|작성자 s001lec
// while문의 조건이 올바르게 설정되었는지 확인해봐.
// for문이 while문 안에 있는 구조가 적절한지 생각해봐.
// count와 sum의 역할이 명확하게 맞는지 다시 점검해봐.