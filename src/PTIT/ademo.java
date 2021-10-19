package PTIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

public class ademo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream("C:\\Users\\default.LAPTOP-DDVPA1B6\\Desktop\\Hello.txt");
            int tmp;
            while ((tmp=fileInputStream.read())!=-1){
                System.out.print((char)tmp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            fileInputStream.close();
        }
    }
}
