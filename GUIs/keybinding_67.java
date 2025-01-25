package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class keybinding_67 {
Game game = new Game();
}

class Game {
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Game() {
        frame = new JFrame("Keybinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        frame.add(label);
    }
    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}