package java.basics.basics_1_81.GUIs;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

// ********************************************
public class opengui_54 {

    public static void main(String[] args) {

        LaunchPage launchPage = new LaunchPage();

    }
}
// ********************************************


class LaunchPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    LaunchPage(){

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==myButton) {
            System.out.println(myButton);
            frame.dispose();
            NewWindow myWindow = new NewWindow();

        }
    }
}
// ********************************************

class NewWindow implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");
    JButton myButton = new JButton("Go back!");

    NewWindow() {

        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(label);
        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == myButton) {
            System.out.println(myButton);
            frame.dispose();
            LaunchPage launchpage = new LaunchPage();

        }
    }
}


