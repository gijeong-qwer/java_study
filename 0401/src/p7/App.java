package p7;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("블록1");
        stack.push("블록2");
        stack.push("블록3");
        stack.push("블록4");

        String block = stack.pop();
        System.out.println(block);

        block = stack.pop();
        System.out.println(block);

        block = stack.pop();
        System.out.println(block);

    }
}

class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;
}