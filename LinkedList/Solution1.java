// This is the solution for the first practice quetion given in practice sheet in apna college
// The LinkList is in the diagram
// This is the only solution of given question


// Question No-160 on leetcode



public class Solution1{
    
    public int getSize(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

    public Node intersectionFind(Node headA,Node headB){
        int sizeA=getSize(headA);
        int sizeB=getSize(headB);

        while(sizeA>sizeB){
            headA=headA.next;
            sizeA--;
        }
         while(sizeB>sizeA){
            headB=headB.next;
            sizeB--;
        } 
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }

    
        
}