import java.util.*;
class Deque{
    public static void main(String args[]){
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
    }
}