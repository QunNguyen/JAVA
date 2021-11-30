package Baitaplon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Chinh {
    public static void main(String[] args) {
        FileReader fr=null;
        try {
            fr=new FileReader("src/Baitaplon/1.txt");//Data.in\
            BufferedReader br=new BufferedReader(fr);
            String s;

            List<sinhvienfile1> list=new ArrayList<>();
            int demcheckso=0;
            int dem=0;
            String a="";
            while((s = br.readLine()) != null) {
                if(demcheckso>0){
                    if(dem==0){
                        dem++;
                        continue;
                    }
                    if (demcheckso<=3) {
                        System.out.print(s);
                    }
                    else {
                        demcheckso=0;
                        System.out.println();
                    }
                    demcheckso++;
                }
                demcheckso++;
            }

            Collections.sort(list, new Comparator<sinhvienfile1>() {
                @Override
                public int compare(sinhvienfile1 o1, sinhvienfile1 o2) {
                    if(o1.ma.compareTo(o2.ma)<0){
                        return -1;
                    }
                    return 1;
                }
            });

            for (int i = 0; i < list.size(); i++) {
                list.get(i).show();
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class sinhvienfile1{
    String ten;
    String ma;
    String soluong;

    public void input(String s){
        String[]a=s.split("\\s");
        ma=a[0];
        ten=a[1];
        soluong=a[2];
    }

    public void show(){
        System.out.println(ma+" "+ten+" "+soluong);
    }

}
