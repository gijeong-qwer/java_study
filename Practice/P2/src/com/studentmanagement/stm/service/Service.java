package com.studentmanagement.stm.service;

import java.util.List;

import com.studentmanagement.stm.dto.StudentDto;
import com.studentmanagement.stm.repository.Repository;
import com.studentmanagement.stm.util.IoUtil;

public class Service {
    Repository repository = new Repository();

    public void register() {
        String name = IoUtil.input("이름 입력 > ");
        int age = Integer.parseInt(IoUtil.input("나이 입력 > "));
        int score = Integer.parseInt(IoUtil.input("성적 입력 > "));
        StudentDto studentDto = new StudentDto(name, age, score); // 인스턴스 생성
        // 저장소 마련
        repository.save(studentDto);
    }

    public void show() {
        List<StudentDto> list = repository.showList();
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
        String searchName = IoUtil.input("검색할 학생명을 입력하세요 > ");
        repository.searchByName(searchName);

    }

    public void remove() {
        String removeName = IoUtil.input("삭제할 학생명을 입력하세요 > ");
        repository.removeByName(removeName);
        IoUtil.print("학생이 삭제되었습니다 ");
    }

    public void update() {
        // 학생 성적 수정
        String updateName = IoUtil.input("성적을 변경할 학생의 이름을 입력해 주세요");
        int updateScore = Integer.parseInt("변경할 성적을 입력해 주세요");
        repository.updateByName(updateName, updateScore);
        IoUtil.print("변경되었습니다- 확인 부탁드립니다");
    }

    public void statistic() {
        int average = repository.scoreAverage();
        IoUtil.print("학생 성적 평균은 " + average + "점입니다");

    }
}
