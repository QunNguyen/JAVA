package PTIT;

import java.util.*;

public class Sapxepdanhsachmathang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<mathang1> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=t; i++) {
            mathang1 std=new mathang1();
            std.nhap(sc,i);
            list.add(std);
        }
        Collections.sort(list, new Comparator<mathang1>() {
            @Override
            public int compare(mathang1 o1, mathang1 o2) {
                if(o1.loinhuan>o2.loinhuan){
                    return -1;
                }
                return 1;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            list.get(i).in();
            System.out.println();
        }
    }
}
class mathang1{
    int stt;
    String ten;
    String nhom;
    float giamua;
    float giaban;
    float loinhuan;

    public void nhap(Scanner sc, int n){
        stt=n;
        ten=sc.nextLine();
        nhom=sc.nextLine();
        giamua=Float.parseFloat(sc.nextLine());
        giaban=Float.parseFloat(sc.nextLine());
        loinhuan=giaban-giamua;
    }

    public void in(){
        System.out.printf(stt+" "+ten+" "+nhom+" ");
        System.out.printf("%.2f",loinhuan);
    }
}
