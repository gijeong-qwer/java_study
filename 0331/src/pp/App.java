package pp;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        XMLparse a = new XMLparse();
        a.Parse();
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3); // 키: "apple", 값: 3
        map.put("banana", 5); // 키: "banana", 값: 5
        map.put("apple", 7); // 키 중복 → 값 덮어씀

        System.out.println(map.get("apple")); // 7
        System.out.println(map.containsKey("banana")); // true

        Map<String, Object> map2 = new HashMap<>();

        map2.put("studentInfo", new Student("magenta"));
        map2.put("hobby", "축구");
        map2.put("...", 1);

        map2.get("studentInfo");
        // Student aa = map.get("studentInfo"); >> 넣을때는 맘대로 넣을수 있지만 가져올때는 마음대로 못자겨옴
        Student aa = (Student) map2.get("studentInfo"); // 그래서 타입 캐스팅을 해줘야함

        System.out.println(map2.get("studentInfo")); // toString사용하면됨 >>
        System.out.println(aa.getName());
        System.out.println(map2.get("hobby"));
        System.out.println(map2.get("magenta")); // null >> key값을 기준으로 검색하는거라 key값이 없어서
        // 이 4개를 엮으면 난이도가 확오름
    }
}

interface Parseable {
    public void Parse();
}

class XMLparse implements Parseable {

    // 자바는 접근제어자는 반드시 명시해야 하고, 자동 승격 안 해줍니다.
    public void Parse() {
        System.out.println("XML");
    }
}

class HTMLparse implements Parseable {

    public void Parse() {
        System.out.println("HTML ");
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

    // @Override
    // public String toString() {
    // // TODO Auto-generated method stub
    // return super.toString();
    // }

    @Override
    public String toString() {

        return name;
    }

}