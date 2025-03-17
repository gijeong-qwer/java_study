public class P9 {
    public static void main(String[] args) {
        // for - 숫자와 관련된 for문 - 잘안씀 고전예제
        // for(초기식; 조건식; 증감식) 증감식에a+=2 조건식은 boolean이라 true일동안으로 해석, 비워놓거나 true를 쓰면 항상 조건
        // 충족
        int sum = 0;
        for (int a = 1; a <= 10; a++) { // for이 끝나는 기준으로a++-> a = 11 -> a<=10 ,for 문이 끝나면서 a 소멸 , for(;;){}=
                                        // while(true){}와 동일 - 무한반복문문
            System.out.println(a); // 다른 for문에서 int a 선언이 가능하다는뜻!
            sum = a;
        }
        System.out.println(sum);

    }
}

// for(int a=1; a <=10 ; a++, a+=2, System.out.println("hi")) {
// System.out.println(a);}