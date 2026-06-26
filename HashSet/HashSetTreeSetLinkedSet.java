import java.util.*;
class HashSetTreeSetLinkedSet{
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();
        hs.add("India");
        hs.add("Russia");
        hs.add("Newzealand");
        hs.add("Australia");
        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("Russia");
        lhs.add("Newzealand");
        lhs.add("Australia");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("Russia");
        ts.add("Newzealand");
        ts.add("Australia");
        System.out.println(ts);
    }
}