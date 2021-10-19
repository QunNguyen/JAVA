package PTIT;

import java.util.*;

public class Lietkevadem {
    static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int cnt = 0;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (check(x +"")) {
                if (map1.containsKey(x)) {
                    int dem = map1.get(x);
                    map1.put(x, 1 + dem);
                } else {
                    map1.put(x, 1);
                    ++cnt;
                    map2.put(x, cnt);
                }
            }
        }
        Set<Map.Entry<Integer, Integer>> entry = map1.entrySet();
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(entry);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() != o2.getValue()) {
                    return o2.getValue() - o1.getValue();
                } else {
                    return map2.get(o1.getKey()) - map2.get(o2.getKey());
                }
            }

        });
        for (Map.Entry<Integer, Integer> x : list) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> arr = new ArrayList<>();
//        Map<String, Integer> map = new LinkedHashMap<>();
//        while (sc.hasNextLine()&&map.size()<10000) {
//            String s = sc.nextLine().trim();
//            String[] a = s.split("\\s");
//            for (int i = 0; i < a.length; i++) {
//                if (checkso(a[i]) == 1) {
//                    addElement(map, a[i]);
//                }
//            }
//        }
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        List<Map.Entry<String, Integer>> listOfEntry = new ArrayList<Map.Entry<String, Integer>>(entrySet);
//        Collections.sort(listOfEntry, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                if (o1.getValue() > o2.getValue()) {
//                    return -1;
//                }
//                return 1;
//            }
//        });
//        for (Map.Entry<String, Integer> entry : listOfEntry) {
//            System.out.println(entry.getKey() + " "+entry.getValue());
//        }
//    }
//
//
//    public static void addElement(Map<String, Integer> map, String s) {
//        if(map.containsKey(s)){
//            int value = map.get(s);
//            map.remove(s);
//            map.put(s, value+1);
//        } else{
//            map.put(s, 1);
//        }
//    }
//
//    public static int checkso(String c){
//        char[]s=c.toCharArray();
//        for (int i = 0; i <s.length-1; i++) {
//            int x=(int)(s[i]-'0');
//            int y=(int) (s[i+1]-'0');
//            if(x>y)return 0;
//        }
//        return 1;
//    }