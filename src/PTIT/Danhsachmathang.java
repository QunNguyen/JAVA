package PTIT;

import java.io.File;
import java.util.*;

public class Danhsachmathang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<mathang2> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=t; i++) {
            mathang2 std=new mathang2(i,sc.nextLine(),sc.nextLine(),sc.nextLine(), sc.nextLine());
            list.add(std);
        }
        Collections.sort(list, new Comparator<mathang2>() {
            @Override
            public int compare(mathang2 o1, mathang2 o2) {
                if(o1.lai>o2.lai){
                    return -1;
                }
                return 1;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            list.get(i).show();
        }
    }
}

class mathang2{
    int ma;
    String ten;
    String donvi;
    int giamua;
    int giaban;
    int lai;


    public mathang2(int i, String ten, String donvi, String giamua,String giaban) {
        this.ma = i;
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = Integer.parseInt(giamua);
        this.giaban = Integer.parseInt(giaban);
        this.lai = Integer.parseInt(giaban)-Integer.parseInt(giamua);
    }

    public void show(){
        System.out.printf("MH");
        System.out.printf("%03d ",ma);
        System.out.println(ten+" "+donvi+" "+giamua+" "+giaban+" "+lai);
    }

    public int getLai() {
        return lai;
    }

    public void setLai(int lai) {
        this.lai = lai;
    }
}
