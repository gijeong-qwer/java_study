package com.choongang.stm.repository;

import com.choongang.stm.dto.StudentDto;

// Repository = 저장소 (데이터 보관소) = 향후 이부분은 DB(SQL)로 넘어감 
public class Repository {

    private StudentDto[] list = new StudentDto[10]; // 배열 늘리기 연습하고싶으면 연습 ㄱㄱ
    private int count = 0; // 생성자에다 초기화 시켜도 되지만 굳이 할 필요 없어서 안함

    // Controller >> Service >> Repository 순으로 생성되면서 라이프 사이클이 공유됨
    public void save(StudentDto studentDto) {

        if (count == list.length) {
            StudentDto[] newList = new StudentDto[list.length * 2];
            for (int i = 0; i < count; i++) { // 얕은 복사 하지만 깊은 복사를 할 필요가 없어서 이런식으로 구조를 짤 필요가 없음, 얕은복사가 정답답
                newList[i] = list[i];
            }
            list = newList;
        }
        list[count] = studentDto;
        count++;
    }

    public StudentDto[] findAll() { // 직접적으로 list권한을 주면 안되므로 (변경하는 경우 방지) >>다른 배열에 복사해서 전달
        StudentDto[] newList = new StudentDto[count]; // count 수만큼 복사

        for (int i = 0; i < count; i++) {
            StudentDto studentDto = new StudentDto();
            studentDto.setName(list[i].getName());
            studentDto.setAge(list[i].getAge());
            studentDto.setScore(list[i].getScore());

            newList[i] = list[i];
        }

        return newList;
    }

    public StudentDto[] findByName(String searchWord) {
        int searchCount = 0;
        for (int i = 0; i < count; i++) {
            if (list[i].getName().contains(searchWord)) {
                searchCount++;
            }
        }

        StudentDto[] newList = new StudentDto[searchCount];
        int newListCount = 0;
        for (int i = 0; i < count; i++) {
            if (list[i].getName().contains(searchWord)) {
                StudentDto studentDto = new StudentDto();
                studentDto.setName(list[i].getName());
                studentDto.setAge((list[i].getAge()));
                studentDto.setScore(list[i].getScore());
                newList[newListCount++] = studentDto;
            }
        }
        return newList;
    }
}
