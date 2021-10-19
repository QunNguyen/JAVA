package PTIT;

import java.util.*;

public class Xeploaihocsinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<hocsinh1> hocsinh1List=new ArrayList<>();
        ArrayList<Integer> arr =new ArrayList<>();
        int t= Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=t; i++) {
            hocsinh1 std=new hocsinh1();
            arr.add(i);
            std.input(sc,i);
            hocsinh1List.add(std);
        }
        Collections.sort(hocsinh1List, new Comparator<hocsinh1>() {
            @Override
            public int compare(hocsinh1 o1, hocsinh1 o2) {
                if(o1.dtb>o2.dtb){
                    return -1;
                }
                return 1;
            }
        });
        int dem=0;
       hocsinh1List.get(0).xephang(1);
        for (int i = 1; i < hocsinh1List.size() ; i++) {
            if(hocsinh1List.get(i).dtb==hocsinh1List.get(i-1).dtb){
                hocsinh1List.get(i).xephang(hocsinh1List.get(i-1).xephang);
                dem++;
            }
            if(hocsinh1List.get(i).dtb<hocsinh1List.get(i-1).dtb){
                hocsinh1List.get(i).xephang(hocsinh1List.get(i-1).xephang+1+dem);
                dem=0;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < hocsinh1List.size(); j++) {
                if(arr.get(i)==hocsinh1List.get(j).stt){
                    hocsinh1List.get(j).show();
                    System.out.println();
                }
            }
        }
    }
}
class hocsinh1{
    String ten;
    float dtb;
    String xeploai;
    int stt;
    int xephang;

    public void input(Scanner sc, int n){
        stt=n;
        ten=sc.nextLine();
        dtb=Float.parseFloat(sc.nextLine());
        xeploai=xeploai(dtb);
    }

    public int xephang(int x){
        return xephang=x;
    }

    public void show(){
        System.out.printf("HS");
        System.out.printf("%02d ",stt);
        System.out.printf(ten+" "+dtb+" "+xeploai+" "+xephang);
    }

    public static String xeploai(float dtb){
        if(dtb<5) return"Yeu";
        if(5<=dtb&&dtb<7) return "Trung Binh";
        if(7<=dtb&&dtb<9) return "Kha";
        return "Gioi";
    }
}
