package PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Danhsachmonhoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=Integer.parseInt(sc.nextLine());
        List<monhoc> list=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            monhoc std=new monhoc(sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(std);
        }
        Collections.sort(list, new Comparator<monhoc>() {
            @Override
            public int compare(monhoc o1, monhoc o2) {
                if(o1.ten.compareTo(o2.ten)<0){
                    return -1;
                }
                return 1;
            }
        });
        for (monhoc i:list) {
            i.show();
        }

    }
}

class monhoc{
    String ma;
    String ten;
    String n;

    public monhoc(String ma, String ten, String n) {
        this.ma = ma;
        this.ten = ten;
        this.n = n;
    }
    public void show(){
        System.out.println(ma+" "+ten+" "+n);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
