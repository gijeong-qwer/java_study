public class App {
    public static void main(String[] args) {
        // 배열 >> 동일 코드를 여러번 반복해야될때 사용 , 같은형태의 데이터를 반복문을 통해 다루고싶다, 메모리 생성은 가능하지만 배열을
        // 쓰지않으면 n명의 데이터가 있으면 n개의 함수가 필요
        // 해결하기 위해 배열이 나옴
        // **** 데이터를 반복처리하기위해 만든것이므로 , 반복문을 쓸때 아니면 굳이 선언할 필요가 없는데 처리한 경우가 많음
        // for문과 연결결
        // 핵심 : **메모리를 만들것, 같은 타입의 메모리를 한번에 만드는 방법이 존재
        // ** 그 메모리는 반복문을 돌릴 수 있다 ,index : 접근하기위해 부여받은 번호라고 표현
        // index는 문법적 추상화로 표현하면 배열에서만 가능?? 걍 배열관련된건 알겠는데 문장이 이상하네
        // index는 조율불가 무조건 0부터
        // 문법과 런타임이 나중에는 다르게 동작할것
        // 배열도 하나의 자료구조, 자료를 하나의 뭉텅이로 묶어서 저장
        // 배열의 형태는 반복문을 돌리기위한 구조이다다

        // 정수로 5명의 학생점수를 관리하고싶다
        // int score1 = 70;
        // int score2 = 70;
        // int score3 = 70;
        // int score4 = 70;
        // int score5 = 70;
        // if (score1>=90)~ , if(score2>=90)
        // 타입[] 변수명 = new 타입[필요한만큼];
        int[] scores = new int[5]; // 5개의 int 형태의 배열을 만들어라
        // new double[5]; 안되는이유 : 타입미스매치때문
        // 문자열 쓰고싶으면 String

        // scores[0] = 70;
        // scores[1] = 80;
        // scores[2] = 60;
        // scores[3] = 50;
        // scores[5000] = 100; // 문법적으로는 가능 , 스택오버플로우 상태 index out of range 범위밖 인덱스

        // System.out.println(scores[2]);

        for (int i = 0; i < 5; i++) {
            if (scores[i] >= 90) {
                System.out.println(scores[i] + "는 A입니다");
            } else if (scores[i] >= 80) {
                System.out.println(scores[i] + "는 B입니다");
            }

        }

    }
}
