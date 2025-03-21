public class P3 {
    public static void main(String[] args) {
        String str = new String("안녕하세요.jpg");

        str.substring(4).substring(3).length(); // 호출된 순서를 보고싶은것
        // 실행순서 str.substring(4)호출됨 >> substring(3)호출됨 >> length() 호출됨
        System.out.println(str);
        System.out.println(str.substring(4));
        System.out.println(str.substring(4).substring(3));
        System.out.println(str.substring(4).substring(3).length()); // 메소드 체이닝 . 으로 잇는것
        // 호출순서() 안부터 str.substring(4)호출됨 >> substring(3)호출됨 >> length() 호출됨 의 결과를
        // println에 넣는다

        // 확장자 명을 출력하세요!!! ex) .jpg 같은거

        str.substring(0); // 특정문자를 찾는 api
        str.lastIndexOf("."); // return 타입 int 매개변수타입 String

        str.substring(str.lastIndexOf(".")); // () 안에 있는것이 우선 a.b 하면 a호출 한다음 b

        System.out.println(str.substring(str.lastIndexOf(".")));

        String qwer = "safdsasdf".substring(0); // 문자열의 리터럴 타입은 String >> 참조타입 (배열 or 클래스) >> String은 클래스
        // return타입이 같은걸로 매치 시켜줘야함 String qwer = "safdsasdf".substring(0).length(); 불가
        // length의 리턴타입이 다름

        int qwert = "safdsasdf".substring(0).length();

    }
}
