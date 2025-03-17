public class P8 {
    public static void main(String[] args) {
        // 리터럴 = 상수 값의 표현법 
        // 정수 리터럴
        int a = 10;
        a = 0xA; //16진수 10;
        a = 0b1010; //2진수 10; 0b1030; 안됨

        // 실수 리터럴
        double b = 10.0;
        b = 1e+10; // 10000000000

        // 문자 리터럴 = 사실 정수다
        char c = 'Q';
        System.out.println(c); //타입이 char 문자리터럴
        int d = 'A';
        System.out.println(d); //타입이 int 정수 리터럴

        char e = 'A' +3;
        System.out.println(e); 
        //타입이 문자이지만 정수3이 문자획수 A(1) B(2) C(3) D(4)

        char f = '안'; // '' <한글자는 되지만 두글자부턴 "" 문자 입력
        System.out.println(f);
        string g = "안녕하세요"; //String은  primitive 기본 타입이 아님!!
        //진짜 데이터는 8개의 char 기본 타입의 데이터

        //논리 러터럴 (참이냐 거짓이냐)
        boolean h = true;
        h =false;

        int i = true; //type mis match
    
        



        byte short int long 정수 float Double 실수 char 문자(한글자) 논리 boolean

    }
}
