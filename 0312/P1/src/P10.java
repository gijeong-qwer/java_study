public class P10 {
    public static void main(String[] args) {
        // 삼항 연산자

        int value = 7;

        // String result = ""; // 문자열 메모리 소멸하지 않게 주의>>if안에 들어가지않게게

        // if (value % 2 == 0) {
        // result = "짝수";

        // } else {
        // result = "홀수";

        // }
        // String result = value % 2 == 0 ? "even" : "odd"; // 3항연산자 위의 코드하고 동일일
        int result = value % 2 == 0 ? 10 : 20;
        System.out.println(result);

    }
}
