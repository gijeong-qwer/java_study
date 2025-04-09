package p1;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

// cls 치면 다 사라짐 
public class ClientApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("클라이언트 시작!!!");

        Socket socket = new Socket("172.30.1.56", 7777); // 접속시도// 파라미터로 IP 주소와 포트번호를 넘겨 줘야함 cmd 에 ipconfig 치면 알 수 있음
        System.out.println(socket);
        System.out.println(socket.getOutputStream());
        System.out.println("접속에 성공!!");

        System.out.print("보낼 문자를 입력 하세요 > ");
        String message = scanner.nextLine();

        // 스트림 사용하기
        // socket.getOutputStream(); // 네트워크는 버퍼를 사용하면 안됨 , 즉시 즉시 보내야하기 때문에
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF(message);

        // 강사님껀 56
        // 포트번호는 컴퓨터를 껐다키면 유효하지 않을 수도 있음
        // 서버가 먼저 존재해야 클라이언트를 사용할 수 있음

        System.out.println("클라이언트 프로그램 종료!!!");

    }
}
