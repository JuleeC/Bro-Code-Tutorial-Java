package java.basics.basics_1_81;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class audio_45 {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        Scanner scanner = new Scanner(System.in);

                File file = new File("Level_Up.wav");
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);

                System.out.println("File not found");




        String response = "";

        while(!response.equals("Q")) {
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();
            try {
                switch (response) {
                    case ("P"):
                        clip.start();
                        break;
                    case ("S"):
                        clip.stop();
                        break;
                    case ("R"):
                        clip.setMicrosecondPosition(0);
                        break;
                    case ("Q"):
                        clip.close();
                        break;
                    default:
                        System.out.println("Not a valid response");
                }
            } catch(Error e) {
                System.out.println("clip not initiated");
            }

        }
        System.out.println("Byeeee!");
    }
}
