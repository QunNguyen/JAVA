package PTIT;

import java.util.*;

public class Bangxephang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<hocsinh3> hs=new ArrayList<>();
        while(t-->0){
            hocsinh3 std=new hocsinh3();
            std.nhap(sc);
            hs.add(std);
            sc.nextLine();
        }

        hs.sort(new Comparator<hocsinh3>() {
            @Override
            public int compare(hocsinh3 o1, hocsinh3 o2) {
                if (o1.ac > o2.ac) {
                    return -1;
                }
                if (o1.ac == o2.ac) {
                    if (o1.sub < o2.sub) {
                        return -1;
                    }
                }
                if(o1.ac==o2.ac&&o2.ten1==o1.ten1){
                    if(o1.ten1.compareTo(o2.ten1)<0){
                        return -1;
                    }
                }
                return 1;
            }
        });


        for (hocsinh3 i:hs) {
            i.in();
            System.out.println();
        }
    }
}

class hocsinh3{
    String ten;
    String ten1;
    int ac;
    int sub;
    public void nhap(Scanner sc){
        ten=sc.nextLine();
        ac=sc.nextInt();
        sub=sc.nextInt();
        ten1=chuanhoa(ten);
    }
    public void in(){
        System.out.printf(ten+" "+ac+" "+sub);
    }

    public static String chuanhoa(String s){
        String[]a=s.split("\\s");
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
        return sb.toString();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public String getTen1() {
        return ten1;
    }

    public void setTen1(String ten1) {
        this.ten1 = ten1;
    }

}
