package com.gijeong.practice.service;

import com.gijeong.practice.dto.StudentDto;
import com.gijeong.practice.repository.Repository;
import com.gijeong.practice.uitl.IoUtil;

public class Service {
    // 기능은 외부 패키지에서 접근하고 사용해야하므로 public으로 구성
    private Repository repository = new Repository();
    // Repository와 생명주기 공유

    public void register() { // 학생등록 미숙함 연습많이필요 ****** 3.26
        // 입력에 대한 기능 스캐너로 받자 (3.25일 생각) >> 입력 io를 만들어서 스캐너 쓸 필요없음 (3.26일 생각)
        String name = IoUtil.input("이름 입력 > ");
        int age = Integer.parseInt(IoUtil.input("나이 입력 > "));
        int score = Integer.parseInt(IoUtil.input("점수 입력 > "));
        StudentDto studentDto = new StudentDto(name, age, score);
        repository.save(studentDto);

        // 입력받을곳을 저장해야하는데 기능파트가 저장까지 담당하면 설계적으로 완성도가 떨어지므로 다른 패키지로 나누어야함
        // 배열을 저장할 메서드를 Repository로부터 가져옴 = sc.nextLine() ;
    }

    public void showlist() { // return이 필요한가?? save repository를쓰면될것같은데>> save repository를 쓰는 메서드를 >
                             // Repository에서 메서드를 가져와서 리스트를 보여주는 함수로 만들자
        // findAll >> 어떻게 쓸까

        repository.findAll();
    }

}
