package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Hinhsao {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
       Map<Integer,Vector> a=new HashMap<>();
       Vector<Integer> b=new Vector<>();
       int n=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n-1 ; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            b.add(y);
            a.put(x,b);
        }
        Set<Integer> keySet =a.keySet();
        boolean tmp=false;
        for (Integer i:keySet) {
            if(a.get(i).size()==n-1){
                System.out.println("YES");
                tmp=true;
            }
        }
        if(tmp==false){
            System.out.println("NO");
        }
    }
}