public class P14 {
    public static void main(String[] args) {
        // 문자열....

        String str1 = "0013501"; // char로 각문자가 들어감 내부가 배열 인터페이스 배우고 다시보기
        // 배열이라고 생각하면서 풀기
        char[] yyy = str1.toCharArray(); // 내부의 char 배열을 return 해줌
        // 문자열 문제가 나오고 문자 하나하나를 컨트롤 해야할 문제가 나온다면면

        int sum = 0;

        for (char c : yyy) {
            // System.out.println(c); // System.out.println((int)c);
            sum += (c-'0') ;  // 문자열0의 숫자 48만큼 빼는것 *****
        }
        System.out.println(sum); // 출력값 346 : 문자에 해당하는 숫자 ex  A = 65 , a = 97

    }
}
