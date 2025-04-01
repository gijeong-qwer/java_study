package com.gijeongpractice.repository;

import com.gijeongpractice.dto.StudentDto;
import com.gijeongpractice.util.IoUtil;
import java.util.*;

public class Repository {

    private StudentDto[] list = new StudentDto[10];
    private int count = 0; // 아 배열 활용법 솔직히 이거 내실력아닌데 강사님이 말한거
    // 그냥 외워져서 쓰는건데 흠..

    // 필드에 인스턴스 배열이 필요>> 메서드 내에 있으면 메서드 종료시
    // 메모리에서 사라지니까

    // 저장하는 메서드를 void 와 return 중 흠
    // 저장하는 값을 return하는 순간 단순 저장구조가 아니게됨

    // 어 근데 save메서드 사용하고 저장하려면 return 써야하는건데 뭐지..?일단바꿔
    // 인스턴스값을 저장하려면 return된값에..? 어 이것도 아닌데데
    // public StudentDto save(){
    // // 아 저장 배열 만드는법 이거 암기한건데.. 그냥 떠오르는데 흠
    // return list[count++]; // list 저장후 count1 증가가
    // }

    // 저장, 수정, 삭제는 “객체 단위”로 일어나고, 객체를 넘기려면 그 객체의 타입을 매개변수로 선언해야 한다.
    public void save(StudentDto studentDto) {
        if (count == list.length) {
            StudentDto[] newList = new StudentDto[list.length * 2];
            for (int i = 0; i < count; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
        list[count] = studentDto;
        count++;
    }

    // findAll , findByName
    // findAll은 정보를 제공해야하므로 return이필요함 >> 배열에 대한 정보니까 배열로 받아볼까
    public StudentDto[] findAll() {
        StudentDto[] newList = new StudentDto[count];
        // 놓친부분 > for 문안에 인스턴스 생성하지 않고 제작 >> 아무것도 없는것에 값을 넣으려다 NullPointException 뜸
        for (int i = 0; i < count; i++) {
            StudentDto studentDto = new StudentDto();
            studentDto.setName(list[i].getName());
            studentDto.setAge(list[i].getAge());
            studentDto.setScore(list[i].getScore());
            // 잘못잡은 방향성
            // newList[i].setName(list[i].getName());
            // newList[i].setAge(list[i].getAge());
            // newList[i].setScore(list[i].getScore());
            newList[i] = studentDto;
        }
        return newList;
    }

    // 검색 기능을 만들고 해당 정보 공개 > 삭제로 나누어야해서 메서드를 찢어야함
    // findByName 에서 searchName 으로 찢어야함

    public StudentDto[] findByName(String name) {
        // 검색한 것을 return하는 배열
        int searchCount = 0;
        for (int i = 0; i < count; i++) {
            if ((list[i].getName()).contains(name)) {
                searchCount++;
            }
        }
        IoUtil.print("총 " + searchCount + "명이 검색되었습니다.");
        StudentDto[] searchDto = new StudentDto[searchCount];
        int newListCount = 0;
        for (int i = 0; i < count; i++) { // list.length
            if ((list[i].getName()).contains(name)) {
                StudentDto studentDto = new StudentDto();
                studentDto.setName(list[i].getName());
                studentDto.setAge(list[i].getAge());
                studentDto.setScore(list[i].getScore());
                searchDto[newListCount] = studentDto;
                newListCount++;
            }
        }
        return searchDto;

    }

    public void delete(String name) {
        int countNum = 0;
        for (int i = 0; i < count; i++) {
            if ((list[i].getName()).equals(name)) {

                for (int j = i; j < count - 1; j++) {
                    // list[j + 1] = list[j]; >> 잘못한 부분 j 에 j+1을 저장해야하는데
                    list[j] = list[j + 1];
                }
                count--;
                i--; // 해당 인덱스 다시점검
                countNum++;
                IoUtil.print(name + "의 데이터가 삭제되었습니다 ");
            }
        }
        IoUtil.print("삭제된 학생의 수는 " + countNum + "명 입니다 ");

    }

    public void edit(String name, int score) {
        for (int i = 0; i < count; i++)
            if (list[i].getName().equals(name)) {
                list[i].setScore(score);
            }
    }

    // public void findByName(String name){ // 찾을 이름 입력받음
    // StudentDto[] newList = new StudentDto[count];
    // for (int i = 0 ; i < count ; i ++){

    // }

    // for (int i = 0; i < count; i++) {
    // StudentDto studentDto = new StudentDto();
    // studentDto.setName(list[i].getName());
    // studentDto.setAge(list[i].getAge());
    // studentDto.setScore(list[i].getScore());

    // newList[i] = studentDto;
    // }

    // }

    // public boolean searchName(){
    // String searchName = service.search().name;

    // return true;
    // }

}
