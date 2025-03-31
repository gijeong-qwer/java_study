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