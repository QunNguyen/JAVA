package thuchanh2.bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quanligiaodich implements ChucNang{

    private List<Giaodich> giaodichList;
    private Scanner sc=new Scanner(System.in);

    public Quanligiaodich() {
        giaodichList=new ArrayList<>();
    }

    @Override
    public boolean nhap(Giaodich g){
        return giaodichList.add(g);
    }
    @Override
    public void danhsach(){
        for (Giaodich i:giaodichList) {
            System.out.println(i);
        }
    }
}
