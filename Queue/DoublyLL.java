public class DoublyLL{

    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
       
    }
     public static Node head;
     public static Node tail;
     public static int size;

    // AddFirst in DOublyLL
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    // AddLast in DOublyLL
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    // print DoublyLL
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // Remove first
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is Empty !!");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    // to reverse a DLL
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[]){
        DoublyLL dll=new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);

        dll.print();
        System.out.println("Size OF DoublyLL : "+size);

        // dll.removeFirst();
        // dll.print();
        // System.out.println("Size OF DoublyLL : "+size);

        dll.reverse();
        dll.print();


    }
}