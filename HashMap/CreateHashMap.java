import java.util.*;
class CreateHashMap{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India" , 100);
        hm.put("China" , 150);
        hm.put("Russia" , 50);
        System.out.println(hm);

        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India" , 100);
        tm.put("China" , 150);
        tm.put("Russia" , 50);
        tm.put("Alaska" , 30);
        System.out.println(tm);

        LinkedHashMap<String,Integer> lm = new LinkedHashMap<>();
        lm.put("India" , 100);
        lm.put("China" , 150);
        lm.put("Russia" , 50);
        lm.put("Alaska" , 30);
        System.out.println(lm);
    }
}