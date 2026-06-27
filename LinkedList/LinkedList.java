// import java.util.LinkedList;
class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;


    // to add the in FIRST position of a linkedlist
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // to add the in last position of a linkedlist
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // To Print a LL
    public void print(){
        if(head==null){
            System.out.println("LL is Empty!!");
            return;
        }
        
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

        // to Remove from the FIRST position of a linkedlist
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty.");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty ");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=tail.data;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
   
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static int iterativeSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
            // if key not found
            return -1;
    }

    // TO reverse a LL
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    // Find ANd Remove Nth node from end
    public void deletNthfromEnd(int n){
        // calculate size 
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head=head.next;
            return;
        }
        // code for delete node from end
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findMidNode(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next !=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; //Slow is a Mid NOde
    }
// to check palindrome LL
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // step 1- Find Midnode
        Node midNode=findMidNode(head);

        // Step 2- Reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        // step 3 -check left half and right half
        while(right!=null){
            if(right.data!=left.data){
            return false; 
            }
           left=left.next;
           right=right.next;
        }
        return true;
        
    }
    // to check if a cycle is present in a LL or NOT
     //also none as floyed's cycle finding algo(FCFA
     
    public static boolean checkCycle(){
        Node slow=head;              
        Node fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true; //Cycle exist
            }
        }
        return false; //Cycle Does not exist

    }

    // to remove a cycle

    public static void removeCycle(){
        // step 1-detect cycle
        Node slow=head;
        Node fast=head;
        int flag=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return;
        }

        // step 2 -find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // remove cycle
        prev.next=null;
    }

    // MERGE   SORT ->

    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;          
        }
        return mergeLL.next;
            
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        // step -1 find mid
        Node mid=getMid(head);

        // left-right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newRight=mergeSort(head);
        Node newLeft=mergeSort(rightHead);

        // merge
        return merge(newLeft,newRight);
    }

    // ZIG-ZAG pattern 

    public void zigZag(){
        // find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        // reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        // alternate merge or zigzag merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }

    }
    

    public static void main(
        String args[]){
        LinkedList ll=new LinkedList();
    
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.addLast(6);
        
        // System.out.println("LL is : ");
        // ll.print();

        // System.out.println("Size Of a LL : "+ll.size);

        // System.out.println("LL after Removed First  : ");
        // ll.removeFirst();
        // ll.print();

        // System.out.println("Size Of a LL : "+ll.size);

        // System.out.println("LL after Removed Last  : ");
        // ll.removeLast();
        // ll.print();

        // System.out.println("Size Of a LL : "+ll.size);

        // System.out.println(iterativeSearch(3));
        // System.out.println(iterativeSearch(10));

        // ll.reverse();
        // System.out.println("LL after R
        // eversing : ");
        // ll.print();

        // ll.deletNthfromEnd(1);
        // System.out.println("After Deleting a Node : ");
        // ll.print();
        // System.out.println(ll.checkPalindrome());


        // head=new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next=new Node(4);
        // head.next.next.next.next=temp;


        // System.out.println(checkCycle());
        // removeCycle();
        // System.out.println(checkCycle());

        // ll.print();
        // ll.head=ll.mergeSort(ll.head);
        // ll.print();


        ll.print();
        ll.zigZag();
        ll.print();

    }

}