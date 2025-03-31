package p4;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Object - 사실 특수한 기능은 없는 클래스, 다른 클래스를 보조하려는 목적
        // - 중요: 모든 클래스는 Object의 자손이다.

        Object a = new Scanner(System.in);
        Object b = new int[5];
        Object c = 5;
        Object d = "dddd";
        d.toString();
        System.out.println(d.toString());

        Student s1 = new Student("시연", 26, 70);
        Student s2 = new Student("시연", 25, 99);
        Student s3 = new Student("시연", 26, 70); // 메모리 관점에서는 다른녀석 >> 이거 관점에 따라 s1과 s3가 같은지 다른지 고민해봐야함

        if (s1 == s3) { // 주소가 같아야 같다고 나오니까 인스턴스가 다르므로 무조건 다름
            System.out.println("같다");
        } else if (s1.equals(s3)) { // 내용이 같다라는 관점에서 해석하라는것 ****** ( 근데 사실 == 이여서 다른 클래스들에서 OVeriding했던거였음)
            System.out.println("다르다");
        }

        s1.toString();
        System.out.println(s1.toString()); // 우리가 구현한적없지만 Object에 toString이 구현되어있음

        // 오버라이딩시 주소값이 아닌 Student클래스의 toString으로 s2yoming이 나옴

        System.out.println(s1); // 패키지와 클래스명을 포함한 메모리의 주소(해시값)를 print하는것
        System.out.println();

        String aaa = "1";
        // String aaa = new String("1");

        switch (aaa) { // 왜 1과 aaa의 1은 주소가 다른데 case"1"로 갈까?
            // switch case문법 내부에서 equals를 사용하기 때문에 가능한것
            case "1":
            case "2":
            case "3":
        }

        int value = s1.hashCode();
        System.out.println(value);// 주소값을 출력하는것은 사실상 해시 코드값을 출력하고 있는것이다
        int value2 = s3.hashCode();
        System.out.println(value2);
        System.out.println(s2.hashCode());
        System.out.println(Integer.toHexString(value)); // 완벽한 주소값은 아니지만 일종의 주소값으로 볼 수 있다.
        // 해시코드도 오버라이딩 할 수 있다 >> 그렇지만 하지는 않음

    }
}

class Student {
    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    // 논리적으로는 거의 안쓰임. 로그 출력 지원으로 가끔 사용함
    @Override // Object의 toString을 오버라이딩
    public String toString() {
        return "name = " + name + ", age= " + age + ", score= " + score;
    }

    // 사실 ... 실무에서는 은근히(?) 거의 안함
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Student)) {
            return false;
        }

        Student stOther = (Student) other;

        if (this.name.equals(stOther.name)) { // 주소가 달라도 이름이 같으면 같다고 인정해주자
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() { // 모든 인스턴스가 해시값이 1이됨됨
        return Objects.hash(this.name, this.age); // Object를 지원하기 위한 유틸클래스
    }

}
