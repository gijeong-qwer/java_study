public class P4 {
    public static void main(String[] args) {
        // 증감연산자 >>연산자 계산할때도 항상 타입신경쓰기 >> 연산자는 타입에 의해 계산이 변경될 수 있다 + 연산결과의 타입도 고려해야함함
        int index = 0;

        index++;
        ++index;
        System.out.println(index);
        // 사실 아래와 같은 코드는 가독성을 낮아질 가능성이 높아서...
        int a = 10;

        int b = a + 3;
        b = ++a + 3;
        // a++; // 혼자쓸때는 ++a; 이런식으로 앞에 관례적으로 잘안붙임임
        // b = a+3;
        System.out.println(b + " " + a);
        b = a++ + 3;
        // b = a+3;
        // a++;
        System.out.println(b + " " + a);

    }
}
