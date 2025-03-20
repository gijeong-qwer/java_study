public class P_practice2 {
    public static void main(String[] args) {

        int count = 0;

        SchoolPrac sego = new SchoolPrac();
        sego.studentList[0] = new StudentPrac();
        sego.studentList[1] = new StudentPrac();
        System.out.println(sego.studentList); // 자바의 배열은 new를 쓰기때문에, 첫배열의 주소와 배열의주소가 같지않다다
        for (int i = 0; i < sego.studentList.length; i++) {
            System.out.println("studentList[" + i + "] = " + sego.studentList[i]);
        }
        System.out.println(sego.studentList[0].age); // 배열이 초기화로 출력하면 0 이나옴

        StudentPrac st1 = new StudentPrac();
        st1.name = "시연";
        sego.studentList[count] = st1;
        System.out.println(sego.studentList[count].name);
        count++;
        System.out.println(sego.studentList[count].name);
        // sego.studentList[count] = new StudentPrac();

    }
}

class SchoolPrac {
    String name;
    String year;
    // StudentPrac[] studentList; // new로 초기화 하지 않았기 때문에 null인상태
    StudentPrac[] studentList = new StudentPrac[5]; // 배열과 연결을 한것 인스턴스가 5개가 만들어진것 x
    // 배열은 5개 모두 null인 상태

}

class StudentPrac {
    String name;
    int age;
    int score;
}
