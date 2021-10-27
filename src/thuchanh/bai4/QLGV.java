package thuchanh.bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLGV implements Chucnang{
    private List<giangvien> list;
    private Scanner sc=new Scanner(System.in);

    public QLGV() {
        list=new ArrayList<>();
    }
    @Override
    public boolean nhap(giangvien q){
        return list.add(q);
    }

    @Override
    public int checkmagiangvien(String s){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).magiangvien.equalsIgnoreCase(s)){
                return 0;
            }
        }
        return 1;
    }
    @Override
    public void danhsach(){
        for (giangvien i:list) {
            System.out.println(i);
        }
    }
}
