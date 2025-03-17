public class P8 {
    public static void main(String[] args) {

        int a = 10;
        while (a < 15) { // if와 사실상 같은 코드 > 한루프만 사용됨 >> while break는 if와 마찬가지라 안씀

            // if (a == 13) { // if - break 의미가 없어지게 만듬듬
            // continue;
            // }
            if (a == 13) {
                a++;
                continue; // a= 13일대 continue문 수행 a =14 부터 다시 쭉내려감
            }
            System.out.println("hi~" + a);
            a++;
            if (a >= 15) {
                break; // 가장 가까운 while 문을 탈출함 -> if 문에 의해 제한됨 => if문의 조건과 while문의 조건은 반대되는 관계가 일반적적
            }
        }
    }
}
