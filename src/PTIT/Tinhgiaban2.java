//package PTIT;
//
//import java.util.*;
//
//public class Tinhgiaban2 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        List<mathang> mathangList=new ArrayList<>();
//        int t=Integer.parseInt(sc.nextLine());
//        for (int i = 1; i <=t ; i++) {
//            mathang std=new mathang();
//            std.input(sc,i);
//            mathangList.add(std);
//        }
//
//        Collections.sort(mathangList, new Comparator<mathang>() {
//            @Override
//            public int compare(mathang o1, mathang o2) {
//                if(o1.giaban>o2.giaban){
//                    return -1;
//                }
//                return 1;
//            }
//        });
//
//        for (int i = 0; i < mathangList.size(); i++) {
//            mathangList.get(i).show();
//            System.out.println();
//        }
//
//    }
//}
//class mathang{
//    String ten;
//    String donvitinh;
//    int dongianhap;
//    int soluong;
//    int ma;
//    double phivanchuyen;
//    double thanhtien;
//    double giaban;
//
//    public void input(Scanner sc, int n){
//        ma=n;
//        ten=sc.nextLine();
//        donvitinh=sc.nextLine();
//        dongianhap=Integer.parseInt(sc.nextLine());
//        soluong= Integer.parseInt(sc.nextLine());
//        phivanchuyen=Math.round(phivanchuyen());
//        thanhtien=Math.round(thanhtien());
//        giaban=Math.ceil(gaiban()/100)*100;
//    }
//    public void show(){
//        System.out.printf("MH");
//        System.out.printf("%02d ",ma);
//        System.out.print(ten+" "+donvitinh+" ");
//        System.out.printf("%.0f ",phivanchuyen);
//        System.out.printf("%.0f ",thanhtien);
//        System.out.printf("%.0f",giaban);
//    }
//
//    public  double phivanchuyen(){
//        return (dongianhap*soluong)*0.05;
//    }
//    public double thanhtien(){
//        return (dongianhap*soluong+phivanchuyen);
//    }
//    public double gaiban(){
//        return (thanhtien+0.02*thanhtien)/soluong;
//    }
//}
