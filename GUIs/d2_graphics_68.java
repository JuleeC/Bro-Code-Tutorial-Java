package GUIs;

import javax.swing.*;
import java.awt.*;

public class d2_graphics_68 {
    public static void main(String[] args) {
        new MyFramme();
    }
}
class MyFramme extends JFrame {
    MyPanel panel;
    MyFramme() {
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.pack();
        this.setVisible(true);


    }


}

class MyPanel extends JPanel {

    MyPanel() {
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g) {
        Graphics g2D = (Graphics) g;
        g2D.drawLine(0,0,500,500);

    }

}
