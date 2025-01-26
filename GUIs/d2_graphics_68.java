package GUIs;

import javax.swing.*;
import java.awt.*;

public class d2_graphics_68 {
    public static void main(String[] args) {
        new MyFramme();
    }
}
class MyFramme extends JFrame {
    MyFramme() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public void paint(Graphics g) {
        Graphics g2D = (Graphics) g;
        g2D.drawLine(0,0,500,500);
    }
}
