package linkedlist;

public class App {
    public static void main(String[] args) {
        Linkedlist<String> list = new Linkedlist<>();
        list.add("시연");
        list.add("나영");
        list.add("마젠타");
        list.add("쵸단");
        list.add("히나");

        String r1 = list.get(2);
        System.out.println(r1);

        list.add(2, "시요밍");
        System.out.println(r1); // 이거 출력결과가 왜 시요밍이 아니지? 아 참조변수였네
        System.out.println(list.get(2));
        String r2 = list.get(4);
        System.out.println(r2);

        list.remove(0);
        list.remove(0);

        String r3 = list.get(0);
        System.out.println(r3);

    }
}

// 배열 vs 링크드리스트
// 메모리 낭비
// 중간 삽입 삭제가 느림(최악) 중간삽입삭제 >> 최상 , 근데 맨끝에 삽입은 배열과 똑같음 느림

// 핵심 코어 구조 - 노드 생성
class Node<E> {
    E value;

    // 배열의 포인터
    Node<E> next;
}

// API
class Linkedlist<E> {

    private Node<E> first = null;

    // 딱 필요한 메모리만 연결중 (RAM이 허용하는 범위까지)
    // 링크드 리스트의 장점
    public void add(E value) { // 맨 뒤에 붙임
        Node<E> newNode = new Node<>();
        newNode.value = value;

        if (first == null) {
            first = newNode;
            return;
        }

        Node temp = first;

        while (true) {

            // 마지막 노드 찾기위함 - 새로생긴 노드 연결
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = newNode;

    }

    // 링크드 리스트의 장점
    public void remove(int index) {

        if (index == 0) {
            // fisrt가 가리키고 있는 메모리 소멸
            first = first.next;
            return;
        }

        Node<E> temp = first;

        // 따라가다 이거 하나 때문에 대부분의 경우에서
        // arrayList가 정답임

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

    }

    // 중간에 추가 (삽입) - 단점 > 삽입할 위치까지 접근을 순차적으로 해야함
    public void add(int index, E value) {
        Node<E> newNode = new Node<>();
        newNode.value = value;

        Node<E> temp = first;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 접근 - 링크드 리스트의 최대 약점 , 접근을 하려면 앞에 있는 놈들을 통해 다 접근해야함
    public E get(int index) {
        Node<E> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

}