import Animales.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serealizable {
    public static void serealitas() throws IOException{
        List<Object> animales = new ArrayList<>();
        animales.add(new Perro("Carlos"));
        animales.add(new Gato("Juan"));
        animales.add(new Labrador("Labraperro"));
        animales.add(new Gato("Gato"));
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.bin"));
            oos.writeObject(animales);
            oos.close();

            File file = new File("file.bin");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Object> list = (List<Object>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
