package GUIs;

import java.util.Calendar;
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
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2025);
        date.set(Calendar.MONTH,Calendar.FEBRUARY);
        date.set(Calendar.DAY_OF_MONTH,1);
        date.set(Calendar.HOUR_OF_DAY,0);
        date.set(Calendar.MINUTE,0);
        date.set(Calendar.SECOND,0);

        //timer.schedule(task,date.getTime());
        //timer.schedule(task,0);
        timer.scheduleAtFixedRate(task,0,1000);
    }
}
