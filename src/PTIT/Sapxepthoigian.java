package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Sapxepthoigian{
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<String> time=new ArrayList<>();
        SimpleDateFormat fd= new SimpleDateFormat("H m s");
        for (int i = 0; i < t ; i++) {
            String s=sc.nextLine();
            time.add(s);
        }
        Collections.sort(time, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                try {
                    Date d1 = fd.parse(o1);
                    Date d2=fd.parse(o2);
                    if(d1.before(d2)){
                        return -1;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 1;
            }
        });
        for (int i = 0; i < time.size(); i++) {
            System.out.println(time.get(i));
        }

    }
}