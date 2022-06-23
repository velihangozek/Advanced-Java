public class StopwatchThread implements Runnable {

    private Thread thread;
    private final String threadName;

    public StopwatchThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating thread : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running thread : " + threadName);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException + "Thread Interrupted! : " + threadName);
        }
        System.out.println("Thread is done! : " + threadName);
    }
    public void start() {
        System.out.println("Thread object is being created : " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
