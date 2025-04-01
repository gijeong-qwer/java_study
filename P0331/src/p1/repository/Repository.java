package p1.repository;

import p1.dto.Studentdto;

public class Repository {
    private Studentdto[] list = new Studentdto[10]; // private 안붙였음 배열에 직접 접근 못하도록 주의
    private int count = 0;

    // 저장공간
    public void save(Studentdto studentdto) { // 여기에 매개변수 넣을 생각못함
        // ** 매개변수가 있어야 특정학생에 대한 저장이라고 생각할 수 있는데
        // public이여야 service가 받음 >> 하 왜이리 헷갈리지 >> 안한지 너무 오래되서그런가가

        if(count ==list.length){
            Studentdto[] newList = new Studentdto[list.length*2]; // 얕은 복사 >> 
            for(int i = 0 ; i<count ; i++){
                newList[i] = list[i];
            }
            list = newList;

        }

        list[count] = studentdto;
        count++;
    }
    // 전체 정보 조회   // 처음 설정한 메서드명 public void findAll()
    public Studentdto[] findAll(){   // 값을 입력 받지 않고
        // repository 인스턴스의 메서드로부터 배열을 return 받으려함
        Studentdto[] newList = new Studentdto[count];

        for(int i = 0 ; i< count ; i++){
            Studentdto studentdto = new Studentdto();
            studentdto.setName(list[i].getName());
            studentdto.setAge(list[i].getAge());
            studentdto.setScore(list[i].getScore());

            newList[i] = list[i];

        }
        // return 타입이 필요한가?? 왜 필요하지?

        return newList;

    }

    // 검색한 학생 정보 조회

    // 데이터 삭제

    // 학생 정보 수정

    // 학생 통계
}
