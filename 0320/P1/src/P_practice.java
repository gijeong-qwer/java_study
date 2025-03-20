public class P_practice {
    public static void main(String[] args) {

        studentPractice qwer = new studentPractice();

        new studentPractice(); // 힙영역에 할당 >> 저장하는 스택영역 변수 x > 힙영역 메모리 소멸

        qwer.name = "시연"; // 참조 타입은 항상 접근 연산자가 따라온다
        qwer.age = 26;
        qwer.score = 100;

        System.out.println(qwer); // qwer변수의 클래스명과 주소 ** 오버라이딩 알면 이해됨
        System.out.println(qwer.name);

        studentPractice hina = new studentPractice();

        hina.name = "히나";
        hina.age = 25;
        hina.score = 100;

        qwer = hina; // qwer 변수가 참조하는 주소가 hina 변수가 참조하는 주소를 저장하면서
                     // qwer이 기존에 저장하던 힙영역의 메모리가 소멸됨

        System.out.println(qwer);
        System.out.println(qwer.name);

    }
}

// class = 형태를 "정의"하는 문법 , 모양을 결정 지은것
class studentPractice {

    String name;
    int age;
    int score;

}