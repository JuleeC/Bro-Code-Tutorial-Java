package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class draganddrop_67 {
    public static void main(String[] args) {
        new MyyFrame();
    }
}

class MyyFrame extends JFrame {
   DragPanel dragPanel = new DragPanel();
    MyyFrame() {
        this.setTitle("Drag and Drop");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }
}
class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("dude.PNG");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPT;
    DragPanel() {

    }

    public void paintComponent(Graphics g) {

    }

    private class ClickListener extends MouseAdapter {

    }

    private class DragListener extends MouseMotionAdapter {

    }

}