import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UseScanner {
    public static void write() throws IOException {
        FileWriter f = new FileWriter("olo.txt",false);
        PrintWriter print = new PrintWriter(f);
        print.println("Olo");
        print.println("ke ace?");
        print.println("Ver link: https://static.wikia.nocookie.net/memes-pedia/images/b/b7/Ola_k_ase.jpg/revision/latest/scale-to-width-down/700?cb=20160227193105&path-prefix=es");
        print.flush();
        print.close();
    }
    public static void read() throws IOException {
        FileReader f = new FileReader("olo.txt");
        Scanner fs = new Scanner(f);
        try{
            while (fs.hasNext()) {
                String text = fs.nextLine();
                System.out.println(text);
            }
        } finally {
            fs.close();
        }
    }
}
