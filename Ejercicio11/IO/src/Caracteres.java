import com.sun.security.auth.SolarisPrincipal;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Caracteres{
   /* Crear un archivo de texto para escribir caracteres con un FileWriter. Escribir “hola” escribiendo carácter por carácter. Hacer flush y cerrarlo. Verificar que se escribió.

    Abrir el mismo archivo para leer caracteres con un FileReader.
    Leer todos los caracteres con un loop hasta que devuelva -1.
    Construir un string con el contenido del archivo usando StringBuilder.
    Print y Scanner*/

    public static void write() throws IOException {
        Scanner in = new Scanner(System.in);
        FileWriter archiv = new FileWriter("holo.txt", false);
        // archiv.write("Holu");
        archiv.write("H");
        archiv.write("o");
        archiv.write("l");
        archiv.write("o");
        System.out.println("Ingrese algo bonito: ");
        String c1 = in.next();
        archiv.write(c1);
        archiv.flush();
        archiv.close();
    }
    public static void read() throws IOException{
        FileReader archiv = new FileReader("holo.txt");
        try{
            while(true){
                int i = archiv.read();
                char c =(char) i;
                if (i == -1) break;
                StringBuilder text = new StringBuilder();
                text.append(c);
                System.out.println(text);
            }
        } finally {
            archiv.close();
        }
    }
}
