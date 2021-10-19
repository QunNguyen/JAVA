package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Trenhat_gianhat {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ng> nguoi=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            ng std=new ng();
            std.input(sc);
            nguoi.add(std);
        }
        Collections.sort(nguoi, new Comparator<ng>() {
            @Override
            public int compare(ng o1, ng o2) {
                if(o1.date.after(o2.date)){
                    return -1;
                }
                return 1;
            }
        });
        nguoi.get(0).show();
        System.out.println();
        nguoi.get(nguoi.size()-1).show();
    }
}

class ng{
    String ten;
    String ngaysinh;
    Date date;

    public void input(Scanner sc) throws ParseException {
        SimpleDateFormat fd=new SimpleDateFormat("dd/MM/yyyy");
        ten=sc.next();
        ngaysinh=sc.next();
        date=fd.parse(ngaysinh);
    }
    public void show(){
        System.out.print(ten);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
