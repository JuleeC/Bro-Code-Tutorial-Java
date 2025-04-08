package java.basics.basics_1_81.GUIs;

public class multithreading_78 {
    //multithreading = Process of executing multiple threads simulataneously
    //                 Helps maximum utliziation of CPU
    //                 Threads are independent, they dont affect the execution of other threads

    public static void main(String[] args) throws InterruptedException {
        //create sublass of Thread
        MyThreadss thread1 = new MyThreadss();
        //or

        // implement Runnable interface and pass instance as an argument to Threads
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread1.join(3000); // calling thread wait until the specified thread dies  or for x milliseconds
        thread2.start();
    }
}
class MyThreadss extends Thread {
    @Override
    public void run() {
        for(int i = 10; i >0; i--){
            System.out.println("Thread #1 : " +i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
        System.out.println("Thread1 is finished");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i <10; i++){
            System.out.println("Thread #2 : " +i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread1 is finished");
    }
}