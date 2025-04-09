package com.studentmanagement.stm.repository;

import java.util.*;
import java.io.*;
import com.studentmanagement.stm.dto.*;

import com.studentmanagement.stm.util.IoUtil;

public class Repository {
    File file = new File("c:/temp/s2yeon.dat");

    List<StudentDto> list = new ArrayList<>();

    public void save(StudentDto studentDto) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);) {
            // 헤더
            dataOutputStream.writeByte('S');
            dataOutputStream.writeByte('T');
            dataOutputStream.writeByte('M');
            dataOutputStream.writeInt(list.size());

            for (StudentDto studentdto : list) {
                dataOutputStream.writeUTF(studentDto.getName());
                dataOutputStream.writeInt(studentDto.getAge());
                dataOutputStream.writeInt(studentDto.getScore());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // list.add(studentDto);
    }

    public void showList() {
        File file = new File("C:/temp/stm.dat");

        if (!file.exists()) {
            IoUtil.print("로드할 파일이 존재하지 않습니다");
            return;
        }
        try (FileInputStream fileInputStream = new FileInputStream(file);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                DataInputStream dataInputStream = new DataInputStream(bufferedInputStream)) {

            byte S = dataInputStream.readByte();
            byte T = dataInputStream.readByte();
            byte M = dataInputStream.readByte();

            if (S != 'S' || T != 'T' || M != 'M') {
                IoUtil.print("파일 포맷이 다릅니다. 로드를 중지하세요");
                return;
            }

            int size = dataInputStream.readInt();

            for (int i = 0; i < size; i++) {
                String name = dataInputStream.readUTF();
                int age = dataInputStream.readInt();
                int score = dataInputStream.readInt();
                StudentDto studentDto = new StudentDto(name, age, score);
                list.add(studentDto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchByName(String searchName) {
        for (StudentDto studentDto : list) {
            if (searchName.contains(studentDto.getName())) {
                String text = "";
                text += "이름: " + studentDto.getName();
                text += " 나이: " + studentDto.getAge();
                text += " 성적: " + studentDto.getScore();
                IoUtil.print(text);
            }
        }
    }

    public void removeByName(String removeName) {
        List<StudentDto> removedList = new ArrayList<>();
        for (StudentDto studentDto : list) {
            if (removeName.equals(studentDto.getName())) {
                continue;
            }
            removedList.add(studentDto);
        }
        list = removedList;
    }

    public void updateByName(String updateName, int updateScore) {
        for (StudentDto studentDto : list) {
            if (updateName.equals(studentDto.getName())) {
                studentDto.setScore(updateScore);
            }
        }
    }

    public int scoreAverage() {
        int sum = 0;
        for (StudentDto studentDto : list) {
            sum += studentDto.getScore();
        }
        sum /= list.size();
        return sum;
    }
}
