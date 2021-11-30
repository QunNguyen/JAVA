package PTIT;

import java.io.*;
import java.util.*;

public class Lietketukhacnhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("src/Baitaplon/1.txt");
        System.out.println(ws);
    }
}

class WordSet{
    String link;
    List<String> a=new ArrayList<>();

    public WordSet(String link) throws IOException {
        FileReader fr=new FileReader(link);
        BufferedReader bf=new BufferedReader(fr);
        String s;
        while ((s=bf.readLine())!=null){
            String x[]=s.split("\\s");
            for (int i = 0; i < x.length; i++) {
                if(check(a,chuanhoa(x[i]))==1){
                    a.add(chuanhoa(x[i]));
                }
            }
        }
        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.compareTo(o2)<0){
                    return -1;
                }
                return 1;
            }
        });

    }

    @Override
    public String toString() {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        return String.valueOf("");
    }

    public static int check(List a, String s){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).equals(s)){
                return 0;
            }
        }
        return 1;
    }

    public static String chuanhoa(String s){
        StringBuilder a=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            a.append(Character.toLowerCase(s.charAt(i)));
        }
        return a.toString();
    }
}
