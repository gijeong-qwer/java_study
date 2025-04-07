package p8;

// import java.io.File;
// import java.io.FileOutputStream;   
import java.io.*;

public class App {
    public static void main(String[] args) {
        // 우리 기준 실 사용 예시
        // 목적 : API 활용시에 문법 오류는 어떻게든 피해보자
        // 네트워크 , 파일입출력은 특히 .. checked 예외 API가 많다

        byte a = 'A';
        // FileOutputStream fileOutputStream2 = null;
        File file = new File("C:\\temp\\aaa.txt");
        // try {
        // fileOutputStream = new FileOutputStream(file);
        // fileOutputStream.write(a);

        // // Thread.sleep(60000);
        // } catch (Exception e) {
        // e.printStackTrace();
        // } finally {
        // if (fileOutputStream != null) {
        // try {
        // fileOutputStream.close(); // 무조건 실행되어야하므로 finally에 작성}
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // }
        // }
        // try with resource
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) { // close 인터페이스 상속받은 녀석들은 변수로 선언 할 수 있다
            fileOutputStream.write(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("파일 생성 완료");
    }
}
