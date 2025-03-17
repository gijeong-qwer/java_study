public class Ptest {
    public static void main(String[] args) {
        char b1 = 97;
        int b2 = b1 + 3; // char은 유니코드에서 숫자로 인식하는 문자타입
        System.out.println(b2);
        // String b3 = b2 +7; 타입 미스매치
        String b3 = b2 + 7 + ""; // "" 를 통해 문자열 타입으로 바꿔줌
        System.out.println(b3);
        String b4 = b2 + 9 + "하이하이";
        System.out.println(b4);
        String b5 = "하이하이" + b2 + 9;
        System.out.println(b5);
    }
}
