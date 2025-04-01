package com.gijeongpractice.service;

import com.gijeongpractice.dto.StudentDto;
import com.gijeongpractice.repository.Repository;
import com.gijeongpractice.util.IoUtil;

public class Service {

    Repository repository = new Repository();
    int count = 0; // 필요하니까 넣긴했는데 이거 흠.. 예전에 넣은거 생각나서 넣은건데

    // register가 void인 이유 등록을 return하고 저장을 받는순간
    // repo의 역할이 못호해 지기 때문 , 받을 순 있으나 코드의 결합도가 높아짐
    public void register() {
        // register 할 때 마다 학생 하나의 정보를 등록하는 것이므로
        // 인스턴스 생성이 필요함(학생당 정보 저장 목적)
        // StudentDto studentDto = new StudentDto(); >> 무지성 인스턴스 생성 흠.. 별론데

        // 입력을 받아야함 , 생성자로 입력과 동시에 선언해도되지만
        // 코드가 너무 더러워 지므로 변수로 따로 받아서 저장한 값을 인스턴스 생성과 동시에 초기화
        String name = IoUtil.input("이름을 입력하세요 > ");
        int age = Integer.parseInt(IoUtil.input("나이를 입력하세요 > "));
        int score = Integer.parseInt(IoUtil.input("점수를 입력하세요 > "));
        StudentDto studentDto = new StudentDto(name, age, score);

        // studentDto는 학생정보의 인스턴스 >> 인스턴스를 보관할곳을(repo) 만들고 보관
        repository.save(studentDto); // 아 이것도 강사님이 처리한 방식 기억난건데흠...
        count++; // 학생수체크
    }

    public void showList() {
        // 배열을 보여준다 일단 직접 가져와보기
        StudentDto[] studentList = repository.findAll();
        // for (int i = 0; i < count; i++) >> 이렇게 사용하면 배열의 길이가 변화가 생겼을때
        // 오류발생 배열의 길이로 써야함
        for (int i = 0; i < studentList.length; i++) {
            String text = "";
            text += "이름: " + studentList[i].getName();
            text += "  성적: " + studentList[i].getAge();
            text += "  점수: " + studentList[i].getScore();
            IoUtil.print(text);

        }

    }

    public void search() {
        // 검색 하려면 입력 받고 저장을 repo에서 해야겠다
        // 딱알았다 service는 그냥 검색할 이름만 받고 그걸 repo에 넘겨줘야징
        String name = IoUtil.input("찾으시는 학생의 이름을 적어주세요 > ");
        StudentDto[] searchDto = repository.findByName(name);
        for (StudentDto studentDto : searchDto) {
            // System.out.println("학생 이름 : " + studentDto); 이렇게 하면 Dto의 주소가 나옴
            // System.out.println("학생 이름 : " + studentDto.getName());//studentDto.getName()
            String text = "";
            text += "이름: " + studentDto.getName();
            text += "  성적: " + studentDto.getAge();
            text += "  점수: " + studentDto.getScore();
            IoUtil.print(text);

        }
        // 아니 근데 repo를 배열로 받아야해? 배열로 안받으면 어떻게 받을 수 있지?>?
        // 메서드에서 print문 출력되게 하긴할 수 있는데 그건 service에서 하는게 맞는데
        // repo print다 지워

        // StudentDto[] studentDtos =repository.findAll();
        // for(int i = 0 ; i <count ; i++){
        // // 참조할 배열 받을것 가져와야하나? >하다가 배운거 기억남 그냥

    }

    public void deleteInfo() {
        String name = IoUtil.input("정보를 삭제할 학생의 이름을 입력해주세요: >");
        // todo 삭제해야할 인스턴스 >> 삭제를 하려면 배열을 건드려야하는데
        repository.delete(name);
        IoUtil.print("학생의 정보가 삭제되었습니다 ");
    }

    public void editInfo() { // 나눌까? 학생정보가 아니라 학생 성적수정 근데 나이수정은 좀이상한데
        String name = IoUtil.input("정보를 수정할 학생의 이름을 입력해주세요: >");
        // 이름을 받고 해당 학생의 성적 바꾸는게 흐름상 나음
        // 변경할 학생의 인스턴스 접근 >>

        int score = Integer.parseInt(IoUtil.input("변경할 성적을 입력해주세요: >"));

        repository.edit(name, score);
        IoUtil.print("정보가 수정되었습니다 ");

    }
}
