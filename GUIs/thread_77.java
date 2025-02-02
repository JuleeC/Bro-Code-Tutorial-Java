package GUIs;

public class thread_77 {
    public static void main(String[] args) throws InterruptedException {
        //thread = execution in a programm.
        // the JVM allows an application to have multiple threads running concurrent.
        // each threads executes parts of your code in parallel with the main thread.
        // the Java Virtual Machine continues to execute threads until the exit method of class Runtime has been called or all user threads have died.

        //System.out.println(Thread.activeCount());
        //Thread.currentThread().setName("MAINNNN");
        //System.out.println(Thread.currentThread().getName());
        //Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

        for(int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());
        thread2.start();
        System.out.println(thread2.isAlive());
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        //a daemon thread has a low priority that is running in the background
        if (this.isDaemon()) {
            System.out.println("daemon thread is running");
        } else {
            System.out.println("This thread is running");
        }
    }


}

