package basics_1_81.GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylistener_65 {
    public static void main(String[] args) {
        new MMyFrame();

    }
}
class MMyFrame extends JFrame implements KeyListener {
    JLabel label;
    MMyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.add(label);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e){
        //invoked when a key is typed. Uses KeyChar, char output
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10,label.getY());
                break;
            case 'w': label.setLocation(label.getX(),label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(),label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10,label.getY());
                break;

        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        // invoked when a physical key is pressed down. Uses KeyCode, int output
//        switch(e.getKeyChar()) {
//            case 'a':
//                label.setLocation(label.getX() - 10, label.getY());
//                break;
//            case 'w':
//                label.setLocation(label.getX(), label.getY() - 10);
//                break;
//            case 's':
//                label.setLocation(label.getX(), label.getY() + 10);
//                break;
//            case 'd':
//                label.setLocation(label.getX() + 10, label.getY());
//                break;

    }
    @Override
    public void keyReleased(KeyEvent e){
        // called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar());
        //with ascii diagramm
        System.out.println("You released key code: " + e.getKeyCode());
    }



}
