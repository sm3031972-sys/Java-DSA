import java.util.*;
class PrintBetweenRange{
    public static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            // this.left=left;
            // this.right=right;
        }
    } 
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data < val){
            // right sub-tree..
            root.right = insert(root.right , val);
        }else{
            // left sub-tree...
            root.left = insert(root.left , val);
        }

        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void printRange(Node root , int k1 , int k2){
        if(root == null){
            return;
        }
        if(k1 <= root.data && k2 >= root.data){
            printRange(root.left ,k1,k2);
            System.out.print(root.data+" ");
            printRange(root.right,k1,k2);
        }else if(k1 > 
        root.data){
            printRange(root.left, k1 , k2);
        }else{
            printRange(root.right, k1 , k2 );
        }
    }
    public static void main(String args[]){
        int values[] = {5,2,1,4,8,6};
        Node root = null;
        int k1 = 1;
        int k2 = 5;



        for(int i=0;i<values.length;i++){
            root = insert(root , values[i]);
        }

        inOrder(root);
        System.out.println();

        printRange(root , k1 , k2);
    }
}