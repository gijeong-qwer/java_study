public class App {
    public static void main(String[] args) {
        // 문자열 -참조변수
        // 문자열 비교시 - equals 사용 ****
        // 배열은 아니지만 String 배열처럼 생각

        String str1 = "안녕하세요"; // 상수의 문자열
        String str2 = new String("안녕하세요"); // new 힙영역에 메모리를 할당한다다
        String str3 = "안녕하세요";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        if (str1 == str2) { // 두 변수의 주소값이 같냐고 질문한거 , == 주소값이 같냐고 물어보는거거
            // JAVA 같은 언어는 이렇고 이런식으로 비교하는 언어도 많음
            System.out.println("두 문자열의 주소값은 같다");
        } else {
            System.out.println("두 문자열의 주소값은 다르다");
        }

        if (str1 == str3) {
            System.out.println("두 문자열의 주소값은은 같다");
        } else {
            System.out.println("다르다");
        }

        if (str1.equals(str2)) { // 문자의 비교시 equals 사용
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

    }
}
