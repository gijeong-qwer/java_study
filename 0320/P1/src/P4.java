public class P4 {
    public static void main(String[] args) {
        int count = 0;
        SchoolP4 schoolP4 = new SchoolP4(); // 학생에 대한 배열은 생성되지않았음 ,

        // schoolP4.studentList[0] = new StudentP4(); // NullPointerException 발생 t[
        // 이부분에서 발생

        // System.out.println(schoolP4.studentList[0].age); // 문법오류인가? no >> 실행하면
        // NullPointerException 발생 0]. 에서 발생 [0]이 null 이였으므로 null에 접근하려고한순간
        // NullPointerException

        // schoolP4.studentList[count] = new StudentP4();

        StudentP4 st1 = new StudentP4();
        st1.name = "한조";
        schoolP4.studentList[count] = st1;
        count++;
        System.out.println(schoolP4.studentList[0].name);

    }
}

class SchoolP4 {
    String name;
    String year; // 학생은 학교에 포함되고 있나요? 이거 어려움
    // StudentP4[] studentList; // 학교에 인스턴스를 생성하고 학생을 메모리에 할당??
    StudentP4[] studentList = new StudentP4[5]; // 배열을 만들었음 > 학생의 인스턴스가 5개 생성되었는가?? nono 다 null로 할당됨됨
    // 아닌 이유 메서드를 직접적으로 쓴것이 아니기 때문

}

class StudentP4 {
    String name;
    int age;
    int score;

}
