package PTIT;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Danhsachdoanhnghiepsinhvienthuctap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<thuctap> tt= new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            thuctap std=new thuctap();
            std.input(sc);
            tt.add(std);
            sc.nextLine();
        }
        Collections.sort(tt, new Comparator<thuctap>() {
            @Override
            public int compare(thuctap o1, thuctap o2) {
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

        for (int i = 0; i < tt.size(); i++) {
            tt.get(i).show();
            System.out.println();
        }
    }
}

class thuctap{
    String madn;
    String tendn;
    int sl;

    public void input(Scanner sc){
        madn= sc.nextLine();
        tendn=sc.nextLine();
        sl=sc.nextInt();
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
