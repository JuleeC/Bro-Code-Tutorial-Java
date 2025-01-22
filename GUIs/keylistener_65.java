package GUIs;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylistener_65 {
    public static void main(String[] args) {


    }
}
class MMyFrame extends JFrame implements KeyListener {
    MMyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);

    }
    @Override
    public void keyTyped(KeyEvent e){
        //invoked when a key is typed. Uses KeyChar, char output
    }
    @Override
    public void keyPressed(KeyEvent e){
        // invoked when a physical key is pressed down. Uses KeyCode, int output
    }
    @Override
    public void keyReleased(KeyEvent e){
        // called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar());
    }



}
