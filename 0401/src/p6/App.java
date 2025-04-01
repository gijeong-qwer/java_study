package p6;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("주문1");
        queue.offer("주문2");
        queue.offer("주문3");
        queue.offer("주문4");

        String job = queue.poll();
        System.out.println(job);

        job = queue.poll();
        System.out.println(job);

        job = queue.poll();
        System.out.println(job);

        job = queue.poll();
        System.out.println(job);

    }
}
