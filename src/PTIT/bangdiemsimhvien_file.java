package PTIT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class bangdiemsimhvien_file {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("src/Baitaplon/2.txt");//Data.in\
            BufferedReader br = new BufferedReader(fr);
            String s;

//            List<sinhvienfile> list = new ArrayList<>();

            int demcheckso = 0;
            int dem=0;
            String a = "";
            while ((s = br.readLine()) != null) {
                if(dem==0){
                    dem++;
                    continue;
                }
                if (demcheckso<=3) {
                    System.out.print(s+" ");
                }
                else {
                    demcheckso=0;
                    System.out.println();
                }
                demcheckso++;
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

//class sinhvienfile{
//    String ten;
//    String msv;
//    String email;
//    String lop;
//
//    public void input(String s){
//        String[]a=s.split("\\s");
//        msv=a[0];
//        ten=a[1];
//        lop=a[2];
//        email=a[3];
//    }
//
//    public void show(){
//        System.out.println(msv+" "+ten+" "+lop+" "+email);
//    }
//
//    public sinhvienfile() {
//    }
//
//    public String getLop() {
//        return lop;
//    }
//
//    public void setLop(String lop) {
//        this.lop = lop;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public void setTen(String ten) {
//        this.ten = ten;
//    }
//
//    public String getMsv() {
//        return msv;
//    }
//
//    public void setMsv(String msv) {
//        this.msv = msv;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}
