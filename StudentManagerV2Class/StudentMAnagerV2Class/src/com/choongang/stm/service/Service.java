package com.choongang.stm.service;

import com.choongang.stm.dto.StudentDto;
import com.choongang.stm.repository.Repository;
import com.choongang.stm.uitl.IoUtil;

// Service = 비즈니스 로직 담당(핵심로직)
public class Service {

    private Repository repository = new Repository();
    // Controller >> Service >> Repository 순으로 생성되면서 라이프 사이클이 공유됨

    public void register() {
        // 학생 등록 로직!!
        String name = IoUtil.input("이름 입력 > ");
        int age = Integer.parseInt(IoUtil.input("나이 입력 > "));
        int score = Integer.parseInt(IoUtil.input("점수 입력 > "));
        StudentDto studentDto = new StudentDto(name, age, score); // 한줄에 다 입력하면 가독성 최악이라 변수로 따로 받았음
        repository.save(studentDto);

    }

    public void showList() {
        StudentDto[] list = repository.findAll();
        // list[0] = null; // 얘는 복사본 값 변경(안전)
        // list[0].setAge(70); // 얕은복사 이러면 데이터가 변형됨 , 깊은 복사시 ㄱㅊㅊ
        // Repository 클래스에서 주소를 단순히 복사한것이기 때문에 수치가 변경되기 때문에 별로
        // 깊은 복사는 실제로는 다룰일이 거의 없음 (어디까지가 안전하게 하는 기준인가>> 를 기준으로 하면됨) , 대부분의 경우는 얕은 복사가 정답
        // 그러나 이 경우만 한해서는 깊은복사

        IoUtil.print("총 인원: " + list.length);

        for (StudentDto studentDto : list) {
            String text = "";
            text += "이름: " + studentDto.getName();
            text += ", 나이: " + studentDto.getAge();
            text += ", 점수" + studentDto.getScore();
            IoUtil.print(text);
        }
    }

    public void search() {
        String searchWord = IoUtil.input("검색어 입력 > ");

        StudentDto[] list = repository.findByName(searchWord);
        IoUtil.print("검색된인원" + list.length);

        for (StudentDto studentDto : list) {
            String text = "";
            text += "이름: " + studentDto.getName();
            text += ", 나이: " + studentDto.getAge();
            text += ", 점수" + studentDto.getScore();
        }

    }

    public void remove() {
        String deleteName = IoUtil.input("삭제할 이름 > ");
        int count = repository.removeByName(deleteName);
        IoUtil.print("삭제된 총 인원: " + count);
    }

    public void statistic() {
        StudentDto[] list = repository.findAll();

        int sum = 0;
        for (StudentDto studentDto : list) {
            sum += studentDto.getScore();
        }
        double average = (double) sum / list.length;
        IoUtil.print("총 인원: " + list.length + ", 평균: " + average);
    }
}
