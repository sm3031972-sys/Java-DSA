import java.util.*;
class KthLevelOfTree{

    public static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void Klevel(Node root,int level,int n){
        if(root == null){
            return;
        }
        if(level == n){
            System.out.print(root.data+" ");
            return;
        }
        Klevel(root.left,level+1,n);
        Klevel(root.right,level+1,n);
    }
    public static void main(String args[]){
    /*
                         1
                        /  \
                       2    3
                      / \  / \
                     4   5 6  7  
     */ 

     Node root=new Node(1);
     root.left=new Node(2);
     root.right=new Node(3);
     root.left.left=new Node(4);
     root.left.right=new Node(5);
     root.right.left=new Node(6);
     root.right.right=new Node(7);

     int n=3;

     Klevel(root,1,n);
    }
}
