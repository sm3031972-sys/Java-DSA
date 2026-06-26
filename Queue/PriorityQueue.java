import java.util.*;
class PriorityQueue{
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(3);
        pq.add(-11);
        pq.add(5);

        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
    }
}