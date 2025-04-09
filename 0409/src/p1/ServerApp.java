package p1;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        // Server가 먼저 가동하고 있어야함 >> 원래 예제는 try -catch 해서 잡아봐야함
        System.out.println("서버 프로그램 시작");

        ServerSocket serverSocket = new ServerSocket(7777); // 일반적으로 port번호를 입력
        // 하나의 서버에서 동일한 포트로 두개의 프로그램은 돌리지 못함 Address already in use: bind
        Socket clientSocket = serverSocket.accept(); // 접속 대기!!!
        // clientSocket안에는 inputstream과 outputstream이 있음

        // 누군가 접속할때까지 멈춤

        System.out.println("누군가 접속했다!!!");

        // 스트림 가져오기

        DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
        System.out.println("클라이언트로 부터 값 전달 대기 중");
        // 클라이언트에서 writeUTF 실행될때까지 대기
        String message = dataInputStream.readUTF();

        System.out.println("클라이언트로 부터 받은 값: " + message);

        System.out.println("서버 프로그램 종료");

    }
}
