package GUIs;

import javax.swing.*;
import java.awt.*;

public class animations_69 {
   MyFraamee frame = new MyFraamee();
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

class MyPannel extends JPanel {
    final int PANEL_WIDTH= 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPannel() {


    }
}