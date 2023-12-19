package Threading;

public class Main {
    public static void main(String[] args) {
        StopWatchThread thread = new StopWatchThread("Thread 1");
        StopWatchThread thread2 = new StopWatchThread("Thread 2");
        StopWatchThread thread3 = new StopWatchThread("Thread 3");

        thread.start();
        thread2.start();
        thread3.start();
    }
}
