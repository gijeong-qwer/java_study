package p6;

public class App {
    public static void main(String[] args) throws Exception {
        PlusThread p1 = new PlusThread(1, 25000);
        PlusThread p2 = new PlusThread(25001, 50000);
        PlusThread p3 = new PlusThread(50001, 75000);
        PlusThread p4 = new PlusThread(75001, 100000);

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();

        long sum = p1.getSum() + p2.getSum() + p3.getSum() + p4.getSum();
        System.out.println(sum);

    }
}

class PlusThread extends Thread {

    private long start;
    private long end;
    private long sum = 0;

    public PlusThread(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        for (long i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}