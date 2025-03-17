public class P4 {
    public static void main(String[] args) {
        int value = (int) (Math.random() * 3) + 1; // Math.random() >> double로 결과값이 나옴 >> 0~2 의 정수로 만들어서 1~3범위로 조정
        // 캐스팅 안하면 타입미스매치가 발생함 , Math.random()은 0.0 ≤ 값 < 1.0 사이의 double을 반환하므로, int 변수
        // 캐스팅은 웬만하면 비추천하지만, 이처럼 의도를 갖고 사용하는건 ㄱㅊ
        if (value == 1) {
            System.out.println("1입니다");
        } else if (value == 2) {
            System.out.println("2입니다");
        } else {
            System.out.println("3입니다.");
        }

        // 캐스팅 확인용용
        int a = (int) 3.7;
        System.out.println(a);
    }
}
