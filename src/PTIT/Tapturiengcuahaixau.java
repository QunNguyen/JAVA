package PTIT;

import java.util.*;

public class Tapturiengcuahaixau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> ds = new ArrayList<>();
        ArrayList<String> ds1 = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String s =sc.nextLine();
            String s1 = sc.nextLine();
            String str = "";
            String str1="";
            String[] a=s.split("\\s+");
            String[] b=s1.split("\\s+");
            int[]check =new int[a.length];
            ArrayList<String> c= new ArrayList<>();

            for (int j = 0; j < a.length; j++) {
                check[j]=0;
            }

            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if(b[j].equalsIgnoreCase(a[k]))
                    {
                        check[k]=1;
                    }
                }
            }

            for (int j = 0; j < a.length; j++) {
                if(check[j]!=1&&check(c,a[j])==1) c.add(a[j]);
            }

            Collections.sort(c, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.compareTo(o2)<0) return -1;
                    return 1;
                }
            });

            for (int j = 0; j < c.size(); j++) {
                System.out.print(c.get(j)+" ");
            }
            System.out.println();
        }
    }
    public static int check(ArrayList<String> a, String x){
        for (int i = 0; i < a.size(); i++) {
            if(x.equalsIgnoreCase(a.get(i))) return 0;
        }
        return 1;
    }
}
