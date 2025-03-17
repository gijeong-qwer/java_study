public class P6 {
    public static void main(String[] args) {
        // switch case문
        // 사실상 없어도 if문 다 대체 가능
        // 실력이 올라가면 올라갈 수록 안쓰는게 정답인 구문

        int a = 1;

        // switch (a) {
        // case 1:
        // System.out.println("it's 1");
        // case 2:
        // System.out.println("it's 2");
        // case 3:
        // System.out.println("it's 3 ");
        // }
        // }
        switch (a) {
            case 1:
                System.out.println("it's 1");
                break;
            case 2:
                System.out.println("it's 2");
                break;
            case 3:
                System.out.println("it's 3 ");
                break;
            default: // if문의 else와 동일한 역할 >> 예외사항항
                System.out.println("그 이외의 로직..!! 실행");
        }
    }

}
// a = 1일때 출력 1 2 3
// a = 3일때 출력 3
// 문법상으로는 구간점프하는 느낌(break가 없을 때 기준) ,현대는 break를 이용하여 분기점 설정하여 사용
// break;를 걸어서 이런일 발생하지 않게함
