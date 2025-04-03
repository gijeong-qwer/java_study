package p8;

import java.util.*;

public class App {

    private static void printZeroToNumberSum(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("시연");
        list.add("히나");
        list.add("쵸단");
        list.add("마젠타");

        for (String input : list) {
            System.out.println(input);
        }

        System.out.println("함수형!!!!");

        ////////// 함수형 /////////////
        // list.forEach(name -> System.out.println(name)); // list.forEach(); // 이렇게도 쓸
        ////////// 수 있음 너무 자주 사용해서 만든 기능
        list.forEach(System.out::println);

        //////////////////////////////////////

        List<Integer> list2 = new ArrayList<>(); // 반복문 돌릴건데 홀수의 값을 제외하고 할거임
        list2.add(3);
        list2.add(4);
        list2.add(7);
        list2.add(8);
        list2.add(1);

        for (int number : list2) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        for (int number : list2) {
            if (number % 2 != 0) {
                int sum = 0;
                for (int i = 0; i < number; i++) {
                    sum++;
                }
                System.out.println(sum);
            }

        }

        /////// 함수형 //////////

        list2.stream()
                .filter(number -> number % 2 != 0)
                .filter(number -> number < 10)
                .distinct() // 중복제거
                .forEach(App::printZeroToNumberSum);

        list2.removeIf(number -> number == 10 || number == 8);

    }
}
