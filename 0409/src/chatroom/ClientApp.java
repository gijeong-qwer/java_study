package chatroom;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("클라이언트 시작");

        System.out.print("닉네임 입력 > ");
        String nickname = scanner.nextLine();

        System.out.println("서버 접속 시도");

        Socket socket = new Socket("172.30.1.56", 8888);

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF(nickname);

        RecieveThread recieveThread = new RecieveThread();
        recieveThread.socket = socket;
        recieveThread.start();

        while (true) {
            System.out.print("보낼 메세지 (종료=Q) > ");
            String message = scanner.nextLine(); // Thread를 사용해서 여러개 프로그램을 실행해야함

            if (message.equals("Q"))
                break;

            dataOutputStream.writeUTF(message);
        }

        socket.close();

        System.out.println("클라이언트 끝");
    }
}

class RecieveThread extends Thread {

    public Socket socket;

    @Override
    public void run() {
        try {
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String message = dataInputStream.readUTF();
                System.out.println(message);
            }
        } catch (Exception e) {
            // e.printStackTrace();
        }

    }
}