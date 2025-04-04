package p9;

import java.security.MessageDigest;
import java.util.Base64;

public class App {
    public static void main(String[] args) throws Exception {
        // 해시 알고리즘 활용(SHA-1, 2, ...MD5.. 등등)
        // 데이터 암호화... password ... 복호 불가능한 암호화
        // SHAR

        String password = "1111" + "asffsafffaf진짜 아무값 사이트별로 동일한 아무거나 값을 넣음 의미 없는걸로 옽ㅌㅏ가나면 더 좋음  "; // 011c945f30ce2cbafc452f39840f025693339c42
        // salting = 기존값 + 솔팅값 >> 해싱이 안됨 >> rainbow어택을 피하는 방법 !!

        // 메시지 소화해서 짧게 요약한 결과
        MessageDigest digest = MessageDigest.getInstance("SHA-512"); // SHA-1 도있음 , 숫자 클 수록 더 큰해싱값
        byte[] hashBytes = digest.digest(password.getBytes()); // digest type이 바이트임
        System.out.println(hashBytes);

        // 문자열 만들기 >> 문자열추가추가추가 하기 힘들때 >> StringBuffer
        StringBuilder hexHashing = new StringBuilder();
        for (byte b : hashBytes) {
            hexHashing.append(String.format("%02x", b));
        }

        String savePassword = Base64.getEncoder().encodeToString(hashBytes);
        // String savePassword = hexHashing.toString();

        System.out.println(savePassword); // 헤싱한 값은 출력

    }
}
