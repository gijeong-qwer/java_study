package com.choongang.stm.service;

import java.util.*;
import com.choongang.stm.dto.StudentDto;
import com.choongang.stm.repository.Repository;
import com.choongang.stm.util.IoUtil;

public class Service {

    Repository repository = new Repository();

    public void register() {
        IoUtil.print("학생 정보 등록을 시작합니다. ");
        String name = IoUtil.input("이름 입력 > ");
        int age = Integer.parseInt(IoUtil.input("나이 입력 > "));
        int score = Integer.parseInt(IoUtil.input("성적 입력 > "));

        StudentDto studentDto = new StudentDto(name, age, score);

        repository.save(studentDto);
        IoUtil.print("학생 정보가 등록되었습니다. ");
    }

    public void showList() {
        List<StudentDto> list = repository.findAll();
        for (StudentDto element : list) { // 변수명 e,element 는 대충 사용한 느낌이라 studentDto 추천
            String text = "";
            text += "이름: " + element.getName();
            text += ", 나이: " + element.getAge();
            text += ", 점수: " + element.getScore();
            IoUtil.print(text);
        }
        IoUtil.print("총 학생 수: " + list.size()); // 배열의 크기는 관여하지 않고 count임 내부에 들어있는 element 개수만 세는것

    }

    public void search() {
        String searchName = IoUtil.input("검색 대상의 이름 입력 > ");
        List<StudentDto> list = repository.findByName(searchName);
        for (StudentDto element : list) {
            String text = "";
            text += "이름: " + element.getName();
            text += ", 나이: " + element.getAge();
            text += ", 점수: " + element.getScore();
            IoUtil.print(text);
        }
        IoUtil.print("검색된 총 학생 수 : " + list.size());
    }

    public void remove() {
        String deleteName = IoUtil.input("삭제할 학생의 이름 > ");
        int count = repository.removeByName(deleteName);
        IoUtil.print("삭제된 학생 수: " + count);
    }

    public void statistics() {
        List<StudentDto> list = repository.findAll();

        int sum = 0;
        for (StudentDto studentDto : list) {
            sum += studentDto.getScore();

        }
        double average = sum / (double) list.size();
        IoUtil.print("총 학생 수 : " + list.size());
        IoUtil.print("평균: " + average);

    }

}
