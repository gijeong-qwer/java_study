public class P5 {
    public static void main(String[] args) {
        // 비교연산자 > < >= <= (숫자) == != ****연산후의 타입 : boolean
        int a = 10;
        boolean b = a > 5; // b= true ;
        // boolean : 불리언 발음 알기
        System.out.println(b);
        // boolean b = "a" > "5"; 자바에서는 안됨
        boolean c = 1 > 3;
        System.out.println(c);

        boolean d = 1 <= 3;
        boolean e = 4 <= 3;
        System.out.println(d + " " + e);

        boolean f = 2 == 3;
        boolean g = "2" == "3"; // ***문법적으로는 가능 문자열
        System.out.println(f + " " + g);

        boolean bb = 5 != 7;
        System.out.println("bb = 5 != 7의 연산결과는: " + bb);

    }
}
