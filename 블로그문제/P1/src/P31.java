public class P31 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            // while (i > 0) {

            for (int j = i; j > 0; j /= 10) {
                int a = j % 10; // int a = i%10; 고민했던 부분 i를 직접적으로 건드리면 문제가 생길것같아서 변수 하나 j추가함함
                if (a == 8) {
                    count++;
                }
            }
        }
        // }
        System.out.println("1~10000사이에서는 8이" + count + "번 나옵니다.");
    }
}
// 1~10000사이에 8이 몇번 나오는가?

// 정답 ) 4000
// 힌트 ) 8838 = 3개...
// [출처] 목표|작성자 s001lec
