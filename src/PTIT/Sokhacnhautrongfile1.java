package PTIT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector;



public class Sokhacnhautrongfile1 {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("DATA.in");
            int k;
            Vector a=new Vector<>();
            String s="";
            while(true) {
                k = fr.read();
                if(k == -1) {
                    a.add(Integer.parseInt(s));
                    break;
                }
                else {
                    int t = k - '0';
                    if (0 <= t && t <= 9) s += (char) k;
                    else {
                        if (s != "") a.add(Integer.parseInt(s));
                        s = "";
                    }
                }
            }
            fr.close();

            Collections.sort(a);
//            for (int i = 0; i < a.size(); i++) {
//                System.out.printf(a.get(i)+" ");
//            }
//            System.out.println();
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
