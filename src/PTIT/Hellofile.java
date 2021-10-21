package PTIT;
import java.io.*;


public class Hellofile {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("Hello.txt");
        DataInputStream dis = new DataInputStream(input);
        try {
            int count = input.available();
            byte[] arr = new byte[count];
            dis.read(arr);
            for (byte bt : arr) {
                char k = (char) bt;
                System.out.print(k);
            }
        } catch (IOException ex) {
        } finally {
            dis.close();
        }
    }
}