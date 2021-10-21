package Baitaplon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class demo {
    public static void main(String[] args) {
        String filename="src/Baitaplon/test.txt";
        File f=new File(filename);
//        System.out.println(f.getAbsoluteFile());
//        System.out.println(f.getName());
//        System.out.println(new Date(f.lastModified()));
//        System.out.println(f.length());
//        File f1=new File("C:\\Users\\default.LAPTOP-DDVPA1B6\\Desktop\\JAVA\\src\\Baitaplon\\test.txt");
//        System.out.println(f1.exists());
        try {
            FileReader r=new FileReader(filename);
            int k;
            while(true){
                try {
                    k=r.read();
                    if(k==-1){
                        break;
                    }
                    char c=(char) k;
                    System.out.print(c);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
