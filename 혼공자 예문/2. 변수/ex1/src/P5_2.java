public class P5_2 {
    public static void main(String[] args) {
        String strVar1 = "박기정";
        String strVar2 = "박기정";

        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름름");
        }

        if (strVar1.equals(strVar2)) {

            System.out.println("strVal1과 strVal2의 문자열이 같음");
        }

        String strVar3 = new String("박기정");
        String strVar4 = new String("박기정");

        if (strVar3 == strVar4) {
            System.out.println("strVar3와 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3와 StrVar4는 참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}
