package PTIT;



import java.util.*;

public class Bangkenhapkho {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<sp> sanp=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            sp std=new sp();
            if(i==0) {
                std.input(sc);
                std.chuanhoama(1);
            }else {
                std.input(sc);
                int dem=1;
                for (int j = 0; j < sanp.size(); j++) {
                    if(std.mahang.equalsIgnoreCase(sanp.get(j).mahang)){
                        dem++;
                    }
                }
                std.chuanhoama(dem);
            }
            sanp.add(std);
        }
//        Collections.sort(sanp, new Comparator<sp>() {
//            @Override
//            public int compare(sp o1, sp o2) {
//                if(o1.tienchietkhau>o2.tienchietkhau){
//                    return -1;
//                }
//                return 1;
//            }
//        });
        for (int i = 0; i < sanp.size(); i++) {
            sanp.get(i).show();
            System.out.println();
        }

    }
}
class sp{
    String ten;
    int sohang;
    int dongia;
    String mahang;
    int maso;
    double tienchietkhau;
    double thanhtien;

    public void input(Scanner sc){
        ten =sc.nextLine();
        sohang=Integer.parseInt(sc.nextLine());
        dongia=Integer.parseInt(sc.nextLine());
        tienchietkhau=dongia*sohang*chietkhau(sohang);
        thanhtien=dongia*sohang-tienchietkhau;
        mahang=chuanhoa(ten);
    }
    public void chuanhoama(int n){
        maso=n;
    }


    public void show(){
        System.out.printf(mahang);
        System.out.printf("%02d ",maso);
        System.out.printf(ten+" ");
        System.out.printf("%.0f ",tienchietkhau);
        System.out.printf("%.0f",thanhtien);
    }

    public static double chietkhau(int n){
        if(n>10) return 0.05;
        if(8<=n&&n<=10) return 0.02;
        if(5<=n&&n<8) return 0.01;
        return 0;
    }
    public static String chuanhoa(String s){
        StringBuilder sb=new StringBuilder("");
        String[]a=s.split("\\s");
        sb.append(Character.toUpperCase(a[0].charAt(0)));
        sb.append(Character.toUpperCase(a[1].charAt(0)));
        return sb.toString();
    }
}
