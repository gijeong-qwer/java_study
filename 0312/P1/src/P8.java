public class P8 {
    public static void main(String[] args) {
        // 비트연산자 : & | ^ (XOR) ~(NOT) 비트단위로 연산
        // 리소스가 제한된 환경에서 쓸일이 있을까?
        // boolean >> 1byte true= 1 , false = 0

        // 어떤 파일에 대한 권한 혹은 설정...
        // /* boolean write = true; ctrl /
        // boolean read = true;
        // boolean execute = true;
        // boolean hidden = false;
        // boolean directory = false;*/

        // write: 0b00000001

        byte info = 0b00000000;
        int someFileInfo = 0b00011010; //26
        someFileInfo = someFileInfo | 0b00000001; 
        // System.out.println(someFileInfo);

        if((someFileInfo & 0b00000010) == 0b00000010){  // 뒤에서 두번째자릿수 비교구문문

        }

        }

    }
}
