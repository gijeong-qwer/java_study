public class P_practice4 {
    public static void main(String[] args) {

        int a = 10; // 지역변수 : 지역내에서만 쓸 수 있는 변수

        Leaner dan = new Leaner();
        Leaner cho = new Leaner(3); // 생성자의 매개변수가 정의되어있으면 그 형태로 매개변수를 정의해줘야함
        System.out.println("cho의 나이: " + cho.age);

        cho.name = "쵸단";
        cho.age = 28;
        cho.score = 100;

        Leaner hina = new Leaner(a);
        hina.name = "히나";
        hina.age = 25;
        hina.score = 100;

        Leaner s2yoen = new Leaner(a + "", 33); // + ""를 사용해 String으로 만들어서 사용가능
        // 두번째 생성자 실행됨

    }
}

class Leaner {
    String name;
    int age;
    int score;

    Leaner() {
        System.out.println("hihi");
    }

    Leaner(String name, int age) {
        this(name, age, 0); //
        System.out.println("생성자 2 실행됨~");
        System.out.println(name);
    }

    Leaner(int age) {
        this.age = age;
        System.out.println("hehe");
    }

    // 생성자 오버로딩 : 하나의 클래스에는 생성자 여러개를 선언할 수 있다. 타입만 똑같지 않으면됨 >> 순서 바뀌면 사용 가능
    Leaner(String name, int b, int c) {
        // name = name;
        // 멤버변수(인스턴스변수) name 과 지역변수 name이 중첩됬을때
        // 우선으로 지역변수를 인지함 자기한테 자기를 넣은상태
        this.name = name; // this 문법적으로 정의된 주소값, this를 잘쓰면 응집도가 높음
        age = b; // 지역변수의 age가 없다는 가정하에 this를 안써도됨 age= age; 안됨
        this.score = c; // 생성자는 앞으로 이렇게 쓰게됨 같은 이름인 경우
        // this() 같은이름의 매개변수를 가진 오버로딩된 함수를 찾아서 사용

    }

}
