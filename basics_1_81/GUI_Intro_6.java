package basics_1_81;

import javax.swing.JOptionPane;


public class GUI_Intro_6 {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        JOptionPane.showMessageDialog(null,"Hello "+age);
        //
    }
}
