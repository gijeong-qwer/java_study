package p10;

import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 0x11223344;

        File file = new File("c:/temp/qqq.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream); // DI :의존성 주입
        DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);

        dataOutputStream.writeInt(a); // 하나당 4바이트
        dataOutputStream.writeInt(a); // 하나당 4바이트
        dataOutputStream.writeInt(a); // 하나당 4바이트
        dataOutputStream.writeInt(a); // 하나당 4바이트
        dataOutputStream.writeInt(a); // 하나당 4바이트
        dataOutputStream.writeUTF("안녕하세요!!!"); // 참고로 이건 좀 위험함 이유는 딱히 설명안한듯 

        // bufferedOutputStream.write(a >> 24);
        // bufferedOutputStream.write(a >> 16);
        // bufferedOutputStream.write(a >> 8);
        // bufferedOutputStream.write(a >> 0);
        // 4번실행 >> 4번하드디스크에 값을 저장 byStream은 진짜 다 byte단위로 작동

        dataOutputStream.close();
        bufferedOutputStream.close();
        fileOutputStream.close();

    }
}
