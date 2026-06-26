import java.util.*;
class IterationOnHashset{
    public static void main(String args[]){
         HashSet<String> hs = new HashSet<>();
        hs.add("India");
        hs.add("Russia");
        hs.add("Newzealand");
        hs.add("Australia");


        // using iteration Method
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // using advanced method
        for(String h:hs){
            System.out.println(h);
        }
    }
}