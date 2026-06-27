public class Solution2{
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
        System.out.print(
            "null");
        System.out.println();
    }

    public static Node linkDelete(Node head,int M,int N){
        int counter=1;
        Node temp=head;

        Node resHead=null;
        Node resTail=null;
        while(temp!=null){
            if(counter<=M){
                if(resTail==null){
                    resHead=resTail=temp;
                }else{
                    resTail.next=temp;
                    resTail=temp;
                }
            }
            if(counter==(M+N)){
                counter=1;
            }else{
                counter++;
            }
            temp=temp.next;
        }
        resTail.next=null;
        return resHead;
    }

    public static void main(String args[]){
        Solution2 s1=new Solution2();
        s1.addLast(10);
        s1.addLast(20);
        s1.addLast(30);
        s1.addLast(40);
        s1.addLast(50);
        s1.addLast(60);
        s1.addLast(70);
        s1.addLast(80);
        s1.addLast(90);
        s1.addLast(100);

        s1.print();
        s1.linkDelete(head,3,2);
        s1.print();


    }
}