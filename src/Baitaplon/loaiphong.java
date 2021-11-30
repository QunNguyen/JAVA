//package Baitaplon;
//
//import java.io.*;
//import java.util.*;
//
//public class loaiphong {
//
//
//    public static void main(String[] args) throws IOException {
//        ArrayList<LoaiPhong> ds = new ArrayList<LoaiPhong>();
//        Scanner in = new Scanner(new File("src/Baitaplon/1.txt"));
//        int n = Integer.parseInt(in.nextLine());
//        while (n-- > 0) {
//            ds.add(new LoaiPhong(in.nextLine()));
//        }
//        Collections.sort(ds);
//        for (LoaiPhong tmp : ds) {
//            System.out.println(tmp);
//        }
//    }
//    static class LoaiPhong implements Comparable<LoaiPhong>{
//        String loai;
//        String ten;
//        String dongia;
//        String phi;
//
//        public LoaiPhong(String s) {
//            String a[] = s.split("\\s");
//            loai = a[0];
//            ten = a[1];
//            dongia = a[2];
//            phi = a[3];
//        }
//
//        @Override
//        public String toString() {
//           return loai+" "+ten+" "+dongia+" "+phi;
//        }
//
//        @Override
//        public int compareTo(LoaiPhong o) {
//            if(ten.compareTo(o.ten)<0){
//                return -1;
//            }
//            return 1;
//        }
//    }
//
//}
//
