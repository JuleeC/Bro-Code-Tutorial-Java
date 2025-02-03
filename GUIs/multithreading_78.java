package GUIs;

public class multithreading_78 {
    //multithreading = Process of executing multiple threads simulataneously
    //                 Helps maximum utliziation of CPU
    //                 Threads are independent, they dont affect the execution of other threads

    public static void main(String[] args){
        MyThreadss thread1 = new MyThreadss();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
    }
}
class MyThreadss extends Thread {
    @Override
    public void run() {
        for(int i = 10; i >0; i--){
            System.out.println("Thread #1 : " +1 );
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

    }
}