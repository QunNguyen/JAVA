package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tinhgio {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<game> g=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            game std=new game();
            std.input(sc);
            g.add(std);
        }
        Collections.sort(g, new Comparator<game>() {
            @Override
            public int compare(game o1, game o2) {
                if(o1.time>o2.time){
                    return -1;
                }
                return 1;
            }
        });
        for (int i = 0; i < g.size(); i++) {
            g.get(i).show();
        }

    }
}
class game{
    String ma;
    String ten;
    String giobd;
    String giokt;
    long time;

    public void input(Scanner sc) throws ParseException {
        ma=sc.nextLine();
        ten=sc.nextLine().trim();
        giobd=sc.nextLine();
        giokt=sc.nextLine();
        time=tinh(giobd,giokt);
    }
    public void show() throws ParseException {
        System.out.print(ma+" "+ten+" ");
        long gio=time/(60*60*1000);
        long phut=time/(60*1000)-gio*60;
        System.out.println(gio+" "+"gio"+" "+phut+" "+"phut");
    }

    public static long tinh(String a, String b) throws ParseException {
        SimpleDateFormat fd=new SimpleDateFormat("HH:mm");
        Date d1=fd.parse(a);
        Date d2=fd.parse(b);
        long time=d2.getTime()-d1.getTime();
        return time;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
