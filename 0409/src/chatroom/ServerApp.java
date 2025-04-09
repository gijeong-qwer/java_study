package chatroom;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

// 단톡방 만들기
public class ServerApp {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 시작!!!");

        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String nickname = dataInputStream.readUTF();

            ClientInfo clientInfo = new ClientInfo();
            // 직접할 땐 setter getter로 바꾸기 시간상 코드량 줄이려고 이렇게 한것
            clientInfo.nickname = nickname;
            clientInfo.socket = socket;
            ClientInfoList.list.add(clientInfo);

            ClientInfoList.broadCast(nickname + "님이 접속하셨습니다");

            ReceiveThreadForServer receiveThreadForServer = new ReceiveThreadForServer();
            receiveThreadForServer.clientInfo = clientInfo;
            receiveThreadForServer.start();
        }
    }
}

class ClientInfo {
    public String nickname;
    public Socket socket;

}

class ClientInfoList {
    // Thread 프로그램은 arrayList 사용못함 Vector 써야됨
    public static List<ClientInfo> list = new Vector<>();

    public static void broadCast(String message) {

        System.out.println("[서버로그]" + message);

        for (ClientInfo clientInfo : list) {
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(clientInfo.socket.getOutputStream());
                dataOutputStream.writeUTF(message);
            } catch (Exception e) {
                // e.printStackTrace();
            }
        }
    }
}

class ReceiveThreadForServer extends Thread {

    public ClientInfo clientInfo;

    // 접속자당 하나의 코드
    @Override
    public void run() {

        try {
            DataInputStream dataInputStream = new DataInputStream(clientInfo.socket.getInputStream());

            while (true) {
                String message = dataInputStream.readUTF();

                String sendMessage = clientInfo.nickname + ": " + message;

                ClientInfoList.broadCast(sendMessage);

            }
        } catch (Exception e) {
            ClientInfoList.list.remove(clientInfo);
            ClientInfoList.broadCast(clientInfo.nickname + "님이 나갔습니다");
        }
    }
}