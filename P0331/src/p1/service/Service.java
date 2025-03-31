package p1.service;

import p1.dto.Studentdto;
import p1.repository.Repository;
import p1.util.IoUtil;

public class Service {
    Repository repository = new Repository();

    // public Service() { // public class의 기본 생성자는 public이다 , 쓸 필요 없는데 그냥 확인용으로 써봄

    // }

    public void register() { // 학생 정보 입력은 service에서 구현했어야했는데 못했음
        // todo: 입력받는 기능 >> 저장은 repository에 // repository.보관소 = input
        // 입력을 여기서 받고 그 값 저장을 repo에서 하면됨 !!!

        String name = IoUtil.input("이름 입력 > ");
        int age = Integer.parseInt(IoUtil.input("나이 입력 > "));
        int score = Integer.parseInt(IoUtil.input("점수 입력 > "));
        Studentdto studentdto = new Studentdto(name, age, score);
        repository.save(studentdto);

    }
}
