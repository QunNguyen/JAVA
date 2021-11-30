package PTIT;

import java.util.*;
import java.io.*;
public class Sokhacnhautrongfile1
{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer,Integer> M = new TreeMap<Integer,Integer>();
        while(sc.hasNextInt())
        {
            int tmp = sc.nextInt();
            if(M.containsKey(tmp))
            {
                M.replace(tmp, M.get(tmp)+1);
            }
            else
            {
                M.put(tmp, 1);
            }
        }
        for(Map.Entry<Integer,Integer> i : M.entrySet())
        {
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}