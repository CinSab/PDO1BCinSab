import java.io.*;
import java.nio.charset.StandardCharsets;

public class Byte {
    public static void writeB() throws IOException {
        FileOutputStream read = new FileOutputStream("text1.txt", false);
        String text = "aaaaaaaah ya no se que escribir";
        byte[] texByte = text.getBytes(StandardCharsets.UTF_8);
        read.write(texByte);
        read.flush();
        read.close();
    }
    public static void buurrito() throws IOException {
        FileOutputStream fops = new FileOutputStream("text2.txt", false);
        DataOutputStream dops = new DataOutputStream(fops);
        dops.writeInt(7);
        dops.writeBoolean(false);
        dops.writeFloat(7.7f);
        dops.flush();
        dops.close();
    }

    public static void read() throws IOException {
        FileInputStream fops = new FileInputStream("text2.txt");
        DataInputStream dops = new DataInputStream(fops);
        int i = dops.readInt();
        boolean bool = dops.readBoolean();
        float flotador = dops.readFloat();
        System.out.println(i+"\n"+bool+"\n"+flotador);
        dops.close();


    }
}

