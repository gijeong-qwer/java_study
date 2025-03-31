package p2;

public class App {
    public static void main(String[] args) {
        Parseable parser = ParseManager.getParser("XML"); // XML의 인스턴스를 Parseable 인터페이스의 참조변수로 받음
        parser.parse("documnet.xml");
        parser = ParseManager.getParser("HTML");
        parser.parse("document.html");

    }
}

interface Parseable {
    public abstract void parse(String name); // String을 왜 받아야하지? >> 묶어주는 클래스가 인스턴스 없이 생성이 될 시 입력할 곳 이 필요하니까 (X)
                                             // parsing할 클래스의 종류를 왜 여기다 넣어야하지? 흠 구조를 왜 여기다 넣어야하는지 이해 할 수가 없네네
}

class ParseManager {
    // 인스턴스 생성 없이 사용하고싶어서 !!
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLParse();
        }
    }
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLParse implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing completed");
    }
}
