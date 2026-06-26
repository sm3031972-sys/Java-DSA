import java.util.ArrayList;
public class ArrayListEx{
    public static void main(String args[]){
 
    ArrayList<Integer> list=new ArrayList<>();

    list.add(10);
    list.add(2);
    list.add(34);
    list.add(49);
    list.add(5);

    // System.out.println(list);

    // System.out.println(list.get(3));
    // list.remove(4);
    // System.out.println(list);
    // list.set(2,10);
    // System.out.println(list);

    // System.out.println(list.contains(10));
    // System.out.println(list.contains(16));

    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i) + " ");
    }
    System.out.println();
    for(int i=list.size()-1;i>=0;i--){
      System.out.print(list.get(i) + " ");
    }
    System.out.println();


   int max=Integer.MIN_VALUE;
   for(int i=0;i<list.size();i++){
    if(max<list.get(i)){
        max=list.get(i);
    }
   }
   System.out.println("Max Element : " + max);

  }
}