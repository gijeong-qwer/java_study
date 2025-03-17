public class P6 {

    public static void main(String[] args) {
        // 논리연산자 ! (단항) && (and ) || (or) // && 가 || 보다 연산자 우선순위가 높다
        // 피연산자 타입은 boolean , 결과타입은 boolean
        boolean a = true;
        boolean b = !a;

        System.out.println(a);
        System.out.println(b);

        boolean c = true && true;
        System.out.println(c);

        int score = 87;
        boolean d = score > 80 && score < 90;
        System.out.println("d의 boolean은 :" + d);
        if (score > 80 && score < 90) {
            System.out.println("점수는 " + score + "이고 성적은 B 입니다.");
        }

        boolean e = true || false;
        System.out.println(e);

        boolean h = score >= 90 || score <= 70;
        System.out.println(h);
    }
}
