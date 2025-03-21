public class P2 {
    public static void main(String[] args) {

        System.out.println(1); // 사용가능한 매개변수가 많다 >> 오버로딩된 메서드가 많다
        System.out.println("1");
        System.out.println(new int[5]); // 주소값을 넘긴것

        double a = Math.random();
        System.out.println(Math.random()); // 이 줄에서 메서드는 두번호출됨 >> 안쪽에 있는 Math.random() 호출 >> 결과 double >> println() 호출

        // API를 문법적으로 다룰 수 있는 최소한의 상황
        double y = Math.sin(5); // 프로모션
        System.out.println(y);

    }
}

class StudentP2 {
    String name;
    int age;
    int score;

}