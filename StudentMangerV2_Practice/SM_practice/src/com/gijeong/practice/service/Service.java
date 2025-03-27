package com.gijeong.practice.service;

import com.gijeong.practice.dto.StudentDto;
import com.gijeong.practice.repository.Repository;
import com.gijeong.practice.uitl.IoUtil;

public class Service {
    // 기능은 외부 패키지에서 접근하고 사용해야하므로 public으로 구성
    private Repository repository = new Repository();
    // Repository와 생명주기 공유
    private int count = 0;

    public void register() { // 학생등록 미숙함 연습많이필요 ****** 3.26
        // 입력에 대한 기능 스캐너로 받자 (3.25일 생각) >> 입력 io를 만들어서 스캐너 쓸 필요없음 (3.26일 생각)
        String name = IoUtil.input("이름 입력 > ");
        int age = Integer.parseInt(IoUtil.input("나이 입력 > "));
        int score = Integer.parseInt(IoUtil.input("점수 입력 > "));
        StudentDto studentDto = new StudentDto(name, age, score);
        repository.save(studentDto);
        count++;
        // 입력받을곳을 저장해야하는데 기능파트가 저장까지 담당하면 설계적으로 완성도가 떨어지므로 다른 패키지로 나누어야함
        // 배열을 저장할 메서드를 Repository로부터 가져옴 = sc.nextLine() ;
    }

    public void showlist() { // return이 필요한가?? save repository를쓰면될것같은데>> save repository를 쓰는 메서드를 >
                             // Repository에서 메서드를 가져와서 리스트를 보여주는 함수로 만들자
        // findAll >> 어떻게 쓸까
        StudentDto[] showStudentDtos = new StudentDto[count];
        showStudentDtos = repository.findAll();
        for (StudentDto studentDto : showStudentDtos) { // 배열 인덱스의 내용이 인스턴스이므로 인스턴스로 받아야함
            // 각 인스턴스에 대해 인덱스 0~ 끝까지 출력하는동안 각 인스턴스에 대한 정보를 출력
            IoUtil.print("학생명 : " + studentDto.getName());
            IoUtil.print(", 나이 : " + studentDto.getAge());
            IoUtil.println(", 점수 : " + studentDto.getScore());

        }
    }

    public void search() {
        // 검색어 받기
        int searchStudent = 0; // 명시적 선언
        String searchName = IoUtil.input("검색할 학생명을 입력하세요 ");
        // todo: 입력받은 검색어와 기존 db 기준으로 동일한 값 있으면 출력
        StudentDto[] searchDto = repository.target(); // 실수로 for문 안에 넣었음
        for (int i = 0; i < count; i++) { // searchDto.length 이거 써도됨 배열의 모든 값과 searchName비교 , // 처음사고 : 전체 학생중 포함되는 글자
                                          // 있는 학생 다꺼내기
            // .ArrayIndexOutOfBoundsException 근데 왜 이게 나오지

            if ((searchDto[i].getName()).contains(searchName)) {
                searchStudent++;
                IoUtil.print("학생명 : " + searchDto[i].getName());
                IoUtil.print(", 나이 : " + searchDto[i].getAge());
                IoUtil.println(", 점수 : " + searchDto[i].getScore());
            }
        }
        IoUtil.println("총 " + searchStudent + "명이 검색되었습니다.");

    }

    public void 

}
