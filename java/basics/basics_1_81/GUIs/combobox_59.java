package java.basics.basics_1_81.GUIs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class combobox_59{

    public static void main(String[] args) {

        // JComboBox = A component that combines a button or editable field and a drop-down list

        new MyFrameeeee();

    }
}
//*********************************************


class MyFrameeeee extends JFrame implements ActionListener{

    JComboBox comboBox;

    MyFrameeeee(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog","cat","bird"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("horse");
        //comboBox.insertItemAt("pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
        System.out.println(comboBox.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
