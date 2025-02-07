package basics_1_81;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter_43 {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("Java_learn/poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
            writer.append("\n(A poem by Bro)");
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}