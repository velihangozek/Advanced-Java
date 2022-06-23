import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        // To set a thread to be a daemon thread, all we need to do is to call Thread.setDaemon(). In this example,
        // we'll use the NewThread class which extends the Thread class:

//        NewThread daemonThread = new NewThread();
//        daemonThread.setDaemon(true);
//        daemonThread.start();

        // Any thread inherits the daemon status of the thread that created it. Since the main thread is a user thread,
        // any thread that is created inside the main method is by default a user thread.

        // The method setDaemon() can only be called after the Thread object has been created and the thread has not
        // been started. An attempt to call setDaemon() while a thread is running will throw an
        // IllegalThreadStateException:

        // Checking if a Thread Is a Daemon Thread

        // Finally, to check if a thread is a daemon thread, we can simply call the method isDaemon():




    }
    @Test(expected = IllegalThreadStateException.class)
    public void whenSetDaemonWhileRunning_thenIllegalThreadStateException() {
        NewThread daemonThread = new NewThread();
        daemonThread.start();
        daemonThread.setDaemon(true);
    }

    @Test
    public void whenCallIsDaemon_thenCorrect() {
        NewThread daemonThread = new NewThread();
        NewThread userThread = new NewThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        userThread.start();

        assertTrue(daemonThread.isDaemon());
        assertFalse(userThread.isDaemon());

    }

}

