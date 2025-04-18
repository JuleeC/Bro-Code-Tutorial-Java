package java.basics.basics_1_81.GUIs;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class timertask_76 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if(counter > 0 ) {
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else  {
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel();
                }
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
        timer.scheduleAtFixedRate(task,date.getTime(),1000);
    }
}
