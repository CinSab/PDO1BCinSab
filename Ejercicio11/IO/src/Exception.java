import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exception {
    public static void read() {
        try {
            FileReader fr = new FileReader("Exception.txt");
            Scanner fs = new Scanner(fr);
            while (fs.hasNext()) {
                String linea = fs.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void writeC() {
        try {
            FileWriter fw = new FileWriter("Exception2.txt", false);
            fw.write("Que lleva ahi?");
            fw.close();
            fw.write("Papa");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}