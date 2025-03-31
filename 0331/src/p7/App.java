package p7;

import java.util.*;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        // API중 원픽 = 컬렉션프레임워크 (자료구조 API)
        // ArrayList, HashMap 필수로 잘 다뤄야됨 : 전자는 넣는 순서가 있다 , 후자는 넣는 순서가 없다 >> 순서가 있으면 반복문을
        // 쓸 수 있다
        List<Student> studentList = new ArrayList<>(); // 사실상 add만 알아도됨
        studentList.add(new Student("시연1"));
        studentList.add(new Student("시연2"));
        studentList.add(new Student("시연3"));
        studentList.add(new Student("시연4"));
        studentList.add(new Student("시연5"));

        // 단순한데 : 이걸 잘 사용한는게 어려움
        for (Student element : studentList) {
            System.out.println(element.getName());
        }

        // Map = 유연한 Dto // Data transfer object
        Map<String, Object> map = new HashMap<>(); // 대부분은 왼쪽을 String으로 짱박아 놓음
        // Map 계열은 순서가 없어서 >> 밑에 세개를 어떤것을 먼저 넣었는지 구분이불가
        // 알고리즘상 순서가 의미가 없게되면서 반복문을 안씀 (의미없어서)

        map.put("studentInfo", new Student("magenta"));
        map.put("hobby", "축구");
        map.put("...", 1);

        map.get("studentInfo");
        // Student aa = map.get("studentInfo"); >> 넣을때는 맘대로 넣을수 있지만 가져올때는 마음대로 못자겨옴
        Student aa = (Student) map.get("studentInfo"); // 그래서 타입 캐스팅을 해줘야함

        System.out.println(aa.getName()); //
        // 이 4개를 엮으면 난이도가 확오름

    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}