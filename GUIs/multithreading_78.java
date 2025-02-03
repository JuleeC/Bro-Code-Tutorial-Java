package GUIs;

public class multithreading_78 {
    //multithreading = Process of executing multiple threads simulataneously
    //                 Helps maximum utliziation of CPU
    //                 Threads are independent, they dont affect the execution of other threads

    public static void main(String[] args){
        MyThreadss thread1 = new MyThreadss();
    }
}
class MyThreadss extends Thread {
    @Override
    public void run() {
        for(int i = 10; i >0; i--){
            System.out.println("Thread #1 : " +1 );
        }
    }
}