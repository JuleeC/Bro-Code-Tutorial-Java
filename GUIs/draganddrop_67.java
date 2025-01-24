package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    ImageIcon image = new ImageIcon("dude.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPT;
    DragPanel() {
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPT = e.getPoint();

        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPT = e.getPoint();
            imageCorner.translate(
                    (int)(currentPT.getX() - prevPT.getX()),
                    (int)(currentPT.getY() - prevPT.getY()));
            prevPT = currentPT;
            repaint();
        }
    }

}