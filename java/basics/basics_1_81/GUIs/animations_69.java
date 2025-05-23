package java.basics.basics_1_81.GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class animations_69 {
    public static void main(String[] args) {
        MyFraamee frame = new MyFraamee();
    }
}

class MyFraamee extends JFrame {
    MyPannel panel;

    MyFraamee(){

        panel = new MyPannel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}

class MyPannel extends JPanel implements ActionListener {
    final int PANEL_WIDTH= 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPannel() {
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        enemy = new ImageIcon("dude.PNG").getImage();
        timer = new Timer(10,this);
        timer.start();

    }
    public void paint(Graphics g){
        super.paint(g); //paint background
        Graphics2D g2D = (Graphics2D) g;
        //g2D.drawImage(enemy,x,y,null);
        g2D.drawRect(x,y,50,50);
        g2D.setColor(Color.RED);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH-enemy.getWidth(null) || x <0) {
            xVelocity = xVelocity * -1;
        }

        x = x + xVelocity;
        repaint();

    }
}