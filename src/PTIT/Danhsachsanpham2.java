package PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Danhsachsanpham2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("src/Baitaplon/1.txt"));
        List<sanpham> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            sanpham std=new sanpham(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            list.add(std);
        }
        Collections.sort(list, new Comparator<sanpham>() {
            @Override
            public int compare(sanpham o1, sanpham o2) {
                if(o1.giaban>o2.giaban){
                    return -1;
                }
                if(o1.giaban== o2.giaban){
                    if(o1.ma.compareTo(o2.ma)<0){
                        return -1;
                    }
                }
                return 1;
            }
        });
        for (sanpham i:list) {
            i.show();
        }
    }
}

class sanpham{
    String ma;
    String ten;
    int giaban;
    int thoigianbh;

    public sanpham(String ma, String ten, int giaban, int thoigianbh) {
        this.ma = ma;
        this.ten = ten;
        this.giaban = giaban;
        this.thoigianbh = thoigianbh;
    }

    public void show(){
        System.out.println(ma+" "+ten+" "+giaban+" "+thoigianbh);
    }

}
