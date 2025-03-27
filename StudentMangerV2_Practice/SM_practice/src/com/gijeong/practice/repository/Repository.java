package com.gijeong.practice.repository;

import com.gijeong.practice.dto.StudentDto;

public class Repository {

    // 어라 .. DTO 있었던거 같은데 어떤 흐름에서 생성됬더라? private 변수들 어디서 생성되야 하는건가.. 흠
    // 저장 파트에서 변수를 저장하는게 나을것 같은데
    // private String[] nameStorage;
    // private ;
    // private int score; >> 데이터 저장방식에 대해 고민 뭔가 아쉬움 >> 이런 부분으로 다시 해보기

    StudentDto[] list = new StudentDto[10];
    private int count = 0; // 인덱스용으로 선언

    public void save(StudentDto studentDto) { // 배열은 같은 타입만 저장 가능한데... 애초에 근데 모든 입력은 String으로 받고 그걸 변형하는건데 원형으로
                                              // 가져와볼까
        // Dto 인스턴스를 저장하는 list 배열에 정보를 저장
        if (count == list.length) {
            StudentDto[] newlist = new StudentDto[list.length * 2];
            for (int i = 0; i < count; i++) {
                newlist[i] = list[i];
            }
            list = newlist;

        }
        list[count] = studentDto;
        count++;

    }

    // 흠... 호출시에 입력을 받게되는건데 >> 기능에 대해 입력을 받아야하는지 고민
    // 전체에 대한 호출이면 필요가 없고, 그러면 검색에서는 필요한건가?
    // 매개변수는 그러면 명시적으로 찾아야할 대상에 대해서 받는 경우에 사용한다고 생각하면 되나?
    // 혹은 입력받는 값에 대해 사용하는건가
    public StudentDto[] findAll() { // 매개변수를 넣는기준은??? 난 넣고 싶었는데 강사님은 왜 빼고 쓰지
                                    // 배열을 받으려고 하는게 아니라 return으로 배열을 service에게 주고싶은것
        // 단순히 list배열을 쓰면 되지만... 정보를 직접적으로 사용하는것이므로 깊은복사를 해야함
        StudentDto[] newlist = new StudentDto[count];
        for (int i = 0; i < count; i++) { // 배열에 대한 복사
            StudentDto newStudentDto = new StudentDto(); // 인스턴스에 대한 복사
            newStudentDto.setName(list[i].getName());// newStudentDto.setName(studentDto); 잘못 생각한 부분 3.26 점심이후
            newStudentDto.setAge(list[i].getAge());
            newStudentDto.setScore(list[i].getScore());

            newlist[i] = list[i];
        }
        return newlist;

    }

    public StudentDto[] target() { // 근데 findAll() 이기능 있는데 굳이 target따로 잡아야해??? 저기서 참조해서 가져오면 안되나? 변수명이 달라서 같은 기능의
                                   // 배열도 따로 구현해야하는건가..
        // 검색하는 메서드 : 인풋을 받아야지 >> 이걸 db에서 받아야해? service로 넘어가기기
        // >> 배열 기준으로 얼만큼 저장해야하는지 감이 잘 안오니까
        StudentDto[] newlist = new StudentDto[count];
        // int targetCount = 0;
       
        for (int i = 0; i < count; i++) { // 범위 count 로 받으면 뭐가문제지?
            StudentDto newstudentDto = new StudentDto();  //**** */ 주의해야할 포인트 >> 생성을 밖으로 빼면 같은 인스턴스를 받음 >> 같은 주소를 받기때문에 같은 값만 나옴

            newstudentDto.setName(list[i].getName());
            newstudentDto.setAge(list[i].getAge());
            newstudentDto.setScore(list[i].getScore());

            newlist[i] = newstudentDto;
        }
        return newlist;

    }

}
