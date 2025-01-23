package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouselistener_66 {
    public static void main(String[] args) {
        MyFrraame frame = new MyFrraame();
    }
}

class MyFrraame extends JFrame implements MouseListener {
    JLabel label;

    MyFrraame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getSource());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
