public class P1 {
public static void main(String[] args) {
    if (command.equals("1")) { // 이름 나이 점수 ***** 막힌부분 다시 구현하기기

        System.out.println("학생정보를 입력하세요");
        System.out.print("학생의 이름은? >");
        String name = scanner.nextLine();
        System.out.print("학생의 나이는? >");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("학생의 점수는? >");
        int score = Integer.parseInt(scanner.nextLine());
        if (count == nameList.length) {
            String[] replace = new String[nameList.length * 2];
            for (int i = 0; i < nameList.length; i++) {
                replace[i] = nameList[i];
            }
            nameList = replace;
            int[] replace_age = new int[nameList.length * 2]; // age 로 바꿔도 되는데 귀찮찮
            for (int i = 0; i < nameList.length; i++) {
                replace_age[i] = ageList[i];
            }
            ageList = replace_age;
            int[] replace_score = new int[nameList.length * 2];
            for (int i = 0; i < nameList.length; i++) {
                replace_score[i] = scoreList[i];
            }
            scoreList = replace_score;
        }
        scoreList[count] = score;
        nameList[count] = name;
        ageList[count] = age;
        count++; 
        // 바꿨는데 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
// at test.main(test.java:70)  
}
}
