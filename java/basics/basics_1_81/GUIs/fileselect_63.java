package java.basics.basics_1_81.GUIs;
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
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button) {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File(".")); //sets current directory

            int response = fileChooser.showOpenDialog(null); //select file to open
            //int response = fileChooser.showSaveDialog(null); //select file to save

            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }

}


