package Threading;

public class StopWatchThread implements Runnable{
    private Thread thread;
    private String threadName;
    public StopWatchThread(String threadName){
        this.threadName = threadName;
        System.out.println(threadName + "is creating");
    }
    @Override
    public void run() {
        System.out.println("Running..." + threadName);
        try{
            for (int i = 0; i <= 10; i++){
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Thread end: " + threadName);

    }
    public void start(){
        System.out.println("Thread object creating");
        if (thread == null) {
            thread = new Thread(this,threadName);
            thread.start();
        }
    }

}
