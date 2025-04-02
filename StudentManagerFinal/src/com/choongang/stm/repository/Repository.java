package com.choongang.stm.repository;

import java.util.*;

import com.choongang.stm.dto.StudentDto;

// 여기 코드 이제는 의미있음. 이해 및 반복 추가
public class Repository {

    private List<StudentDto> studentlist = new ArrayList<>(); // 내부알고리즘은 배열 알고리즘을 따라감

    public void save(StudentDto studentDto) {
        studentlist.add(studentDto);
    }

    // 다형성 이용 받는쪽은 List인지 ArrayList인지 분류 못함
    public List<StudentDto> findAll() {
        // 얕게 복사해서 리턴 >> 깊게 복사하는게 맞지만 , 우리과정상 얕은복사로 list 다루는게 필요한 목적으로 제작
        List<StudentDto> result = new ArrayList<>();

        for (StudentDto e : studentlist) {
            result.add(e);
        }

        return result;
    }

    // repo에서 중요한 코드
    public List<StudentDto> findByName(String searchName) {
        List<StudentDto> result = new ArrayList<>();

        for (StudentDto e : studentlist) {
            if (e.getName().contains(searchName)) {
                result.add(e);
            }
        }
        return result;
    }

    // Iterator 와 remove가 같이 있으면 꼬임 >> Iterator 밖에있으면 상관없음
    // public int removeByName(String deleteName) {
    // int count = 0;
    // for (StudentDto e : studentlist) { // Iterator 사용
    // if (e.getName().equals(deleteName)) { >> Object로 지우면 탐색알고리즘에서 찾는과정중에
    // // Iterator와 충돌하여 문제 .ConcurrentModificationException
    // studentlist.remove(e); // Iterator 돌리는데 remove 하면 코드가 터짐
    // count++;
    // }
    // }

    // return count;
    // }

    public int removeByName(String deleteName) {
        // 주의 상항: 앞으로 List 사용시 remove를 활용할 일은 거의 없음
        // 특정 List를 반복하는 도중에 그 List의 요소를 추가 삭제 할 수 없음
        // 우회하기 위한 코드
        // 살짝 넘어가도 되는 코드

        List<StudentDto> deleteStudentList = new ArrayList<>();

        for (StudentDto e : studentlist) { // 삭제할 학생 목록 생성
            if (e.getName().equals(deleteName)) {
                deleteStudentList.add(e);
            }
        }

        for (StudentDto e : deleteStudentList) {
            studentlist.remove(e);

        }

        return deleteStudentList.size();
    }

}
