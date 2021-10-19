package PTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Danhsachdoanhnghiepsinhvienthuctap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<thuctap1> tt= new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            thuctap1 std=new thuctap1();
            std.input(sc);
            tt.add(std);
        }

        Collections.sort(tt, new Comparator<thuctap1>() {
            @Override
            public int compare(thuctap1 o1, thuctap1 o2) {
                if(o1.sl>o2.sl){
                    return -1;
                }
                if(o1.sl==o2.sl) {
                    if (o1.madn.compareTo(o2.madn) < 0) {
                        return -1;
                    }
                }
                return 1;
            }
        });

        int n=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            int y= sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+x+" DEN "+y+" SINH VIEN:");
            for (int j = 0; j < tt.size(); j++) {
                if(x<=tt.get(j).sl&&tt.get(j).sl<=y) {
                    tt.get(j).show();
                    System.out.println();
                }
            }
        }
    }
}

class thuctap1{
    String madn;
    String tendn;
    int sl;

    public void input(Scanner sc){
        madn= sc.nextLine();
        tendn=sc.nextLine();
        sl=Integer.parseInt(sc.nextLine());
    }
    public void show(){
        System.out.print(madn+" "+tendn+" "+sl);
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getMadn() {
        return madn;
    }

    public void setMadn(String madn) {
        this.madn = madn;
    }
}
