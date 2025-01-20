package GUIs;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class fileselect_63{

    public static void main(String[] args) {

        // JFileChooser = A GUI mechanism that let's a user choose a file (helpful for opening or saving files)

        new MyFrrame();
    }
}


class MyFrrame extends JFrame implements ActionListener{

    JButton button;

    MyFrrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }


}


