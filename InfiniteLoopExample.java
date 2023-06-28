class InfiniteLoop extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println ("EXAMPLE FOR INFINITE LOOP");
        }
    }
}
public class InfiniteLoopExample {
    public static void main(String[] args) {
        InfiniteLoop loop = new InfiniteLoop();
        loop.start();
    }
}

