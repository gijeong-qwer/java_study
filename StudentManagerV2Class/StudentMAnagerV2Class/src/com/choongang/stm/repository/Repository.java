package com.choongang.stm.repository;

import com.choongang.stm.dto.StudentDto;

// Repository = 저장소 (데이터 보관소) = 향후 이부분은 DB(SQL)로 넘어감 
public class Repository {

    private StudentDto[] list = new StudentDto[10]; // 배열 늘리기 연습하고싶으면 연습 ㄱㄱ
    private int count = 0; // 생성자에다 초기화 시켜도 되지만 굳이 할 필요 없어서 안함

    // Controller >> Service >> Repository 순으로 생성되면서 라이프 사이클이 공유됨
    public void save(StudentDto studentDto) {

        if (count == list.length) { // if로 크게 한번 메서드 만들고 for 에대해서 또 나눌수있음 >> 나눠보기기
            StudentDto[] newList = new StudentDto[list.length * 2];
            for (int i = 0; i < count; i++) { // 얕은 복사 하지만 깊은 복사를 할 필요가 없어서 이런식으로 구조를 짤 필요가 없음, 얕은복사가 정답
                newList[i] = list[i]; // 이것도 메서드 나눌 수 있음 >> 다 해보고 안되면 SRP에 대한 관점으로 GPT한테 질문하기 어떻게나누고 작성하는게 좋나
            }
            list = newList;
        }
        list[count] = studentDto; // 위아래 두줄 list[count++] = studentDto; 로 줄 일 수 있음
        count++;
    }

    public StudentDto[] findAll() { // 직접적으로 list권한을 주면 안되므로 (변경하는 경우 방지) >>다른 배열에 복사해서 전달
        StudentDto[] newList = new StudentDto[count]; // count 수만큼 복사

        for (int i = 0; i < count; i++) { // Db관련해서는 깊은복사
            StudentDto studentDto = new StudentDto();
            studentDto.setName(list[i].getName());
            studentDto.setAge(list[i].getAge());
            studentDto.setScore(list[i].getScore());

            newList[i] = list[i]; // 이거 newList[i] = studentDto; 를 저장해야 깊은복사가됨
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
        for (int i = 0; i < count; i++) { // Db관련해서는 깊은복사
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

    public int removeByName(String deleteName) {
        int deleteCount = 0;
        for (int i = 0; i < count; i++) {
            if (list[i].getName().equals(deleteName)) {
                for (int j = i; j < count - 1; j++) {
                    list[j] = list[j + 1];
                }
                count--;
                i--;
                deleteCount++;
            }
        }
        return deleteCount;
    }
}
