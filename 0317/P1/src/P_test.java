// 버블정렬 만들어보기
public class P_test {
    public static void main(String[] args) {
        String str1 = "0013501";

        char[] yyy = str1.toCharArray();// 내부의 char 배열을 return 해줌
        // 문자열 문제가 나오고 문자 하나하나를 컨트롤 해야할 문제가 나오면

        int sum = 0;

        for (char c : yyy) {
            // System.out.println(c);
            // sum += c; 문자열 0013501 의 유니코드 덧셈
            sum += (c - '0');
        }
        System.err.println(sum);

    }
}
