import java.util.*;
class IterationOnHashMap{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India" , 100);
        hm.put("China" , 150);
        hm.put("Russia" , 50);
        hm.put("Indonesia" , 60);
        hm.put("Bhutan" , 30);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k:keys){
            System.out.println("keys = "+k+", values = "+hm.get(k));
        }
    }
}