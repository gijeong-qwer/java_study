package p3;

public class App {
    public static void main(String[] args) {
        // API 나라면 API 어떻게 만들었을까 return타입과 parameter을 고민해보고 제작자 입장에서 생각해보기

        // API , Library , Framework
        // API = App을 만들기 위한 툴
        // Library = API를 모은 녀석 (JSL)
        // 대부분의 경우... 이해는 중요하지 않다. 어떻게 사용할 것인지가 중요.
        // 단 , 몇몇 경우 이해가 매우 중요해질 수도 있다.
        // - 자료구조(컬랙션) , 네트워크 ,파일 입출력, 비동기식

        // API 공부법:
        // 필요할 때 찾아 쓴다. (검색 ,ChatGpt)
        // 자주 사용되는 것은 자연적으로 익숙해진다.
        // 까먹어도 전혀 손해는 아니다.
        // 단 , 특정 API가 존재하는지 여부를 판단하는 경험은 중요

        // String value = new String("안녕하세요, 반갑습니다 , 잘부탁드립니다.");
        String value = "안녕하세요, 반갑습니다 , 잘부탁드립니다. ";
        System.out.println(value);
        value.length(); // value. static이 아니라는뜻 , String. 과 value. 의 의미차이를 생각하기
        System.out.println(value.length());
        // value. 나온건 인스턴스 >> "안녕하세요, 반갑습니다 , 잘부탁드립니다. " 이것이 안쓰이면 응집도와 관련이 없다
        // *** 왜 이렇게 만들었는지 고민 ***
        // String. // static >> 전역변수 사용 >>
        value.split(value);
        System.out.println(value.split(value)); // 인스턴스 주소들이 나옴
        value.split(",", 7);
        System.out.println(value.split(",", 7));

        // String = 불변객체 >> setter가 없는거임 처음 받을때만 저장하고 못 바꾸는것

        String[] qwer = value.split(","); // String의 메서드를 사용해야할지 value의 메서드를 사용해야할지 생각
        // 클래스의 메서드와 인스턴스의 메서드에 대해 고민

        value.replaceAll("다", "다용"); // 안쪽에 있는 값을 바꾸는거였으면 return타입이 void 였을것
        // 생성된 인스턴스에 바꿔주는 방식이기에 지금 저장이 안된것
        System.out.println(value);
        System.out.println(value.replaceAll("다", "다용"));
        value = value.replaceAll("다", "다용");
        System.out.println(value);

        value.substring(5);
        // String 타입의 참조변수로 받아도 되고 , 안해도 되고 >> 가시성 을 위해서 하려고 노력
        System.out.println(value.substring(5));
        value.substring(2, 8);
        System.out.println(value.substring(2, 8));

        value.indexOf("다"); // 맨앞부터 찾음
        System.out.println(value.indexOf("다"));

        value.indexOf("반갑");

        String filepath = "C: \\aaa\\auosafljk.jpg";
        // 파일명을 출력하세요
        filepath.substring(filepath.indexOf("\\"));
        System.out.println(filepath.substring(filepath.indexOf("\\")));
        filepath.substring(filepath.lastIndexOf("\\") + 1);
        System.out.println(filepath.substring(filepath.lastIndexOf("\\") + 1));
        String filename = filepath.substring(filepath.lastIndexOf("\\") + 1);
        System.out.println(filename);

        if (filename.contains("반갑")) { // charsequence 보고 다형성 떠올릴 수 있어야함.
            // filename.indexOf("반갑") != -1 아니면 0이상으로 해도되고
            // indexOf 나 contains 는 로직이 갖지만 return이 boolean이냐 index의 수 int 이냐 정도로 나뉨 그냥
            // 쓰고싶은거 사용하면됨

        }

        String[] arrString = { "1111", "2222", "3333" };
        String result1 = "1111,2222,3333";

        // Iteratable
        String result = String.join(",", arrString);
        System.out.println(result);

    }
}

// String 보면서 . 문법에 대해 모호함이 늘었음 ..>> 앞에 부분 복습이 필요**
