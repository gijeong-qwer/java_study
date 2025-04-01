package p1;

public class App {
    // 컬렉션프레임워크 (자료구조 관련 API 모음)
    // 자료구조: List ,Set ,Map
    // 특정 자료구조에 대해 장점과 단점을 구분 할 수 있는게 중요
    // 문법적으로는 클래스와 배열밖에 없음 자료구조는
    // 배열의 단점 : 삽입 삭제가 비효울적임 + 문법적으로 자료의 크기를 고정해야함
    // 크기를 지정해야함 - 오버플로우 , 메모리낭비 , 데이터 맨 뒤에 추가
    // 데이터 삽입시 기존의 배열을 움직이고 옮겨야함 >> 복사하는 과정에서 메모리 낭비가 많이됨
    // 해당 배열에 내가 원하는 값이 존재하는지 안하는지 확인하려면? ex 시연있어? (검색)도 느림
    // 배열은 입력한 순서를 알 수 있음
    // Linkedlist : 배열의 단점을 명확하게 인지하고 >> 삽입 삭제 관련해서 linked list는
    // 배열 인덱스가 저장하는 주소를 저장하는 공간을 바꿈

    int[] scoreList = new int[10];
}

class StudentDto {
    private String name;
    private int age;
    private int score;
}