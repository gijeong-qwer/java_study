// public class P18 {
//     public static void main(String[] args) {
//         boolean isPrime = true; // ✅ 소수 여부를 저장하는 변수

//         for (int i = 2; i < 863; i++) {
//             if (863 % i == 0) {
//                 System.out.println("소수가아닙니다");
//                 isPrime = false; // ✅ 소수가 아님을 저장
//                 break;
//             }
//         }

//         if (isPrime) { // ✅ 소수라면 한 번만 출력
//             System.out.println("소수입니다");
//         }
//     }
// }

// public class P18 {    // ✅ 내가 만든 정답답
//     public static void main(String[] args) {
//         for (int i = 2; i < 863; i++) {
//             if (863 % i == 0) {             // 1번 발상
//                 System.out.println("소수가아닙니다");
//                 return;
//             }

//         }
//         System.out.println("소수입니다");

//     }
// }
// 863은 소수 인가?
// (소수는 1과 자신이외의 정수로 나누어지지 않는 수)

// [힌트]
// `모든 수를 나누어봤을때 나누어지지 않았는가?`에 대한 변수가 필요
// `소수가 아닙니다`를 출력하는 것은 쉬움. `소수 입니다`를 출력하는 것은 어려움
// [출처] 목표|작성자 s001lec

// public class P18 {
//     public static void main(String[] args) {
//          int num= 863;  // 같은수 자꾸쓰면 변수로 만들어주는게 좋음
//         for (int i = 2; i < num; i++) {
//             if (num % i == 0) {             // 1번 발상
//                 System.out.println("소수가아닙니다");
//                 return;
//             }

//         }
//         System.out.println("소수입니다");

//     }
// }

public class P18 {
    public static void main(String[] args) {
        int num = 863; // 같은수 자꾸쓰면 변수로 만들어주는게 좋음
        // for(int num = 2; num <= 100; num++)
        boolean isPrime = true; // 초기값이 중요 >> 소수라고 가정하고 시작작
        for (int i = 2; i <= num / 2; i++) { // gpt가 설명한거거 // i * i <= num 이게 더 최적화 i <=Math.sqrt(num)와 동일
            if (num % i == 0) { // 1번 발상
                isPrime = false;
                break;
            }

        }
        if (isPrime == true) { // isPrime 만 넣어도가능능
            System.out.println(num + "는 소수 입니다");
        } else {
            // System.out.println(num + "는 소수가 아닙니다");
        } // 소수가 아닌건 판별하기 쉬움움

    }
}