public class P3 {
    public static void main(String[] args) {
        // 단축배정 연산자 (일반적으로는 산술 연산자에 많이 쓰임)

        int sum = 0;
        sum = sum + 3;
        sum = sum + 3;
        sum = sum + 3;
        System.out.println(sum);
        sum += 3; // 단축배정 연산자 >> 이항연산자임 , cf) 개발을 깊게 할수록 코드량이 늘어남
        sum += 3;
        sum += 3;

        sum -= 3; // sum = sum - 3; >> 메모리가 변함 , = :대입연산자 때문
        // 여기는 잘안씀 쓰는사람도있긴함
        sum *= 3; // sum= sum *3;
        sum /= 3; // sum = sum /3;
        sum %= 3; // sum = sum %3;

        // 증감연산자 ++, -- (단항 연산)
        int index = 0;
        index = index + 1; // 정직
        index += 1; // 단축 배정
        index++; // 증감 1씩 올라감 **셋다 변수의 값이 변한다
        index--;

    }
}
