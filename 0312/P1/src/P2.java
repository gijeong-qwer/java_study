public class P2 {
    public static void main(String[] args) {
        // + 기능: 산술연산 및 문자열 더하기 기능 (문자열 연산)
        String a1 = "안녕하세요";
        String a2 = "반갑습니다";

        String a3 = a1 + " \n" + a2;
        System.out.println(a3); // 문자열 결합

        String a4 = a1 + a2 + 3; // '3' 과 동일 문자열로 받음 문 문 수 >> 문 문 문 3이 문자가됨, 문자연산이 숫자연산보다 우선
        System.out.println(a4);
        String a5 = a1 + a2 + 3 + 4; //
        String a6 = a1 + a2 + 3 * 4; //
        System.out.println(a5);
        System.out.println(a6); // 산술 연산을 먼저하고 문자열 계산시작
        String a7 = a1 + a2 + (3 + 4);
        System.out.println(a7);
        // 문자열 연산 - 불가 >> 문문-수 하면 오류류

    }
}
