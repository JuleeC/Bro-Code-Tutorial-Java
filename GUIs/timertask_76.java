package GUIs;

import java.util.Timer;
import java.util.TimerTask;

public class timertask_76 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task is complete ");
            }
        };


    }
}
