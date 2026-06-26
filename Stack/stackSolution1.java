// 234 leetcode question
import java.util.*;
import java.util.LinkedList;
class stackSolution1{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;

    public static boolean isPalindrome(LinkedList list){
        Stack<Node> s=new Stack<>();

        for(Node curr=head;curr!=null;curr=curr.next){
            s.push(curr);
        }

         Node left=head,right=s.peek();

         while(s.isEmpty()){
            right=s.pop();
            if(left.data!=right.data) return false;
                left=left.next;
         }
         return true;
    }
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);

        System.out.println(isPalindrome(list));

    }
}