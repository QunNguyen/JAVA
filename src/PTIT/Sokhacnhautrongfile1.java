package PTIT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector;



public class Sokhacnhautrongfile1 {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("src/Baitaplon/1.txt");
            int k;
            Vector a=new Vector<>();
            String s="";
            while(true) {
                k = fr.read();
                char c=(char)k;
                if('0'<=c&&c<='9'){
                    s+=c;
                } else {
                    if(s!="") a.add(Integer.parseInt(s));
                    s="";
                }
                if(k == -1) {
                    break;
                }
            }
            fr.close();

            Collections.sort(a);
            int dem=1;
            for (int i = 1; i <a.size(); i++) {
                if(a.get(i)==a.get(i-1)){
                    dem++;
                }
                else {
                    System.out.println(a.get(i-1)+" "+dem);
                    dem=1;
                }
            }
            System.out.println(a.get(a.size()-1)+" "+dem);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
