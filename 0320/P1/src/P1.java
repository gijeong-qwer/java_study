public class P1 {
    public static void main(String[] args) { // 참조타입변수 qwer new 힙영역에 메모리를 생성하겠다
        // 인스턴스 생성 문법 : new 클래스명();
        Student qwer = new Student(); // ***좌: 변수생성문법, 우: 인스턴스를 생성하는 문법 // 메모리를 생성한다 = 인스턴스를 생성한다

        new Student(); // 힙메모리는 참조할 주소가 없으면 소멸되므로 >> 생성되자마자 소멸되는것 문법적으로 가능

        Student st1 = new Student();
        // 인스턴스를 생성했어~ >> 인스턴스 = 하나하나의 생성된 메모리(뭉처진 덩어리)
        qwer.name = "기정"; // 참조타입은 항상 접근연산자가 따라온다
        System.out.println(qwer); // 클래스의 이름하고 주소값이 나옴 , 오버라이딩 알면 이해됨 ** 다시 찾아보기
        qwer.age = 26; // 배열은 접근해서 인덱스로 구분 , 인스턴스는 .으로 접근해서 변수명으로 접근!!!!
        st1.age = 24;
        st1.name = "시연";

        System.out.println(qwer.name + "의 나이는" + qwer.age + "입니다");
        System.out.println(st1.name + "의 나이는" + st1.age + "입니다");

        qwer = st1; // qwer의 참조하는 주소가 st1이 되면서 qwer이 참조하던 힙영역의 메모리가 gc에 의해 사라짐
        // 인스턴스의 개수는 한개 = 힙영역에 할당된 메모리의 개수수

        System.out.println(qwer.name + "의 나이는" + qwer.age + "입니다");
        System.out.println(st1.name + "의 나이는" + st1.age + "입니다");

    }
}

// class = 형태를 "정의"하는 문법 , 모양을 결정을 지은것

class Student { // 모양을 만드는 문법 : 클래스를 정의한다 (구조를 정의한다) 클래스도 하나의 자료구조조
    // 메모리 생각하면서 만들기

    String name;
    int age;
    int score;

}

// 내생각: 메모리 지금 한개 >> 클래스 안썼으니까