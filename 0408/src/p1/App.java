package p1;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) {
        // 비트맵(이미지)를 코드로 만들어보자!!

        // 리틀 인디안 방식 역순으로 보는거
        File file = new File("c:/temp/qwer.bmp");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream)) {

            // 헤더
            dataOutputStream.writeByte('B');
            dataOutputStream.writeByte('M');

            // dataOutputStream.writeInt(30054);
            dataOutputStream.writeByte(30054 >> 0);
            dataOutputStream.writeByte(30054 >> 8);
            dataOutputStream.writeByte(30054 >> 16);
            dataOutputStream.writeByte(30054 >> 24);

            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);

            // dataOutputStream.writeInt(54);
            dataOutputStream.writeByte(54 >> 0);
            dataOutputStream.writeByte(54 >> 8);
            dataOutputStream.writeByte(54 >> 16);
            dataOutputStream.writeByte(54 >> 24);

            // dataOutputStream.writeInt(40); // 헤더의 크기

            dataOutputStream.writeByte(40 >> 0);
            dataOutputStream.writeByte(40 >> 8);
            dataOutputStream.writeByte(40 >> 16);
            dataOutputStream.writeByte(40 >> 24);

            // dataOutputStream.writeInt(100);
            dataOutputStream.writeByte(100 >> 0);
            dataOutputStream.writeByte(100 >> 8);
            dataOutputStream.writeByte(100 >> 16);
            dataOutputStream.writeByte(100 >> 24);

            // dataOutputStream.writeInt(100);
            dataOutputStream.writeByte(100 >> 0);
            dataOutputStream.writeByte(100 >> 8);
            dataOutputStream.writeByte(100 >> 16);
            dataOutputStream.writeByte(100 >> 24);

            // dataOutputStream.writeShort(1);
            dataOutputStream.writeByte(1 >> 0);
            dataOutputStream.writeByte(1 >> 8);

            // dataOutputStream.writeShort(24);
            dataOutputStream.writeByte(24 >> 0);
            dataOutputStream.writeByte(24 >> 8);

            dataOutputStream.writeInt(0); // 압축 방식
            // dataOutputStream.writeInt(30000);
            dataOutputStream.writeByte(30000 >> 0);
            dataOutputStream.writeByte(30000 >> 8);
            dataOutputStream.writeByte(30000 >> 16);
            dataOutputStream.writeByte(30000 >> 24);

            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(0);

            // raw data - 순서가 역순이라 반대로 생각해야함
            // for (int x = 0; x < 100; x++) {
            // for (int y = 0; y < 100; y++) {

            // if (y == 20) {
            // dataOutputStream.writeByte(0x00);
            // dataOutputStream.writeByte(0x00);
            // dataOutputStream.writeByte(0xFF); // R
            // continue;
            // }

            // dataOutputStream.writeByte(0x00);
            // dataOutputStream.writeByte(0x00);
            // dataOutputStream.writeByte(0xFF); // R

            // }
            // }

            // raw data
            // 알고리즘 문제: 2개의 좌표 값이 주어졌을때 그사이를 검은색으로 칠해보자
            // 예 (10,10) (80,90)

            for (int y = 99; y >= 0; y--) {
                for (int x = 0; x < 100; x++) {

                    if (y == 20 || x == 20) {
                        dataOutputStream.writeByte((int) (Math.random() * 255));
                        dataOutputStream.writeByte((int) (Math.random() * 255));
                        dataOutputStream.writeByte((int) (Math.random() * 255));
                        continue;
                    }

                    dataOutputStream.writeByte(0xFF);
                    dataOutputStream.writeByte(0xFF);
                    dataOutputStream.writeByte(0xFF); // R

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("이미지 생성 완료!!!");
    }
}
