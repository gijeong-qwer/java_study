package p5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) {
        // Java
        // Exception 상속받은 클래스: Checked 예외
        // 문법적으로 try를 사용하지 않으면 문법 오류. (자바만의 특징... 조금 욕 먹고 있음...)
        // RuntimeException 상속받은 클래스 : Unchecked 예외
        // 사실 RuntimeException도 Exception을 상속 받았음

        try {
            FileOutputStream fos = new FileOutputStream("aaa");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String value = "fff";
        int qqq = Integer.parseInt(value);

    }
}
