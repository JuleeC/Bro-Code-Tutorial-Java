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
        Graphics g2D = (Graphics2D) g;
        g2D.setColor(Color.blue);
        //g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0,0,500,500);
        //for all draw methods, see documents
        g2D.drawRect(0,0,100,100);
        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setColor(Color.yellow);
        g2D.drawPolygon(xPoints,yPoints,3);
        g2D.setColor(Color.black);
        g2D.setFont(new Font("Ink Free",Font.BOLD,50));
        g2D.drawString("U R A WINNER !:)", 5,50);
    }

}
