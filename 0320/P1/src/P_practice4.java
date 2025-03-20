public class P_practice4 {
    public static void main(String[] args) {

        int a = 10; // 지역변수 : 지역내에서만 쓸 수 있는 변수수

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

        Leaner s2yoen = new Leaner(a + "", 33);

    }
}

class Leaner {
    String name;
    int age;
    int score;

    Leaner() {
        System.out.println("hihi");
    }

    Leaner(String a, int b) {
        System.out.println("생성자 2 실행됨~");
        System.out.println(a);
    }

    Leaner(int age) {
        this.age = age;
        System.out.println("hehe");
    }
}
