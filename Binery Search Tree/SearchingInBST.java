import java.util.*;
class SearchingInBST{
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
    public static boolean search(Node root ,int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(key > root.data){
            return search(root.right , key);
        }else{
            return search(root.left , key);
        }

        
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String args[]){
        int values[] = {5,2,1,4,8,6};
        Node root = null;
        int key = 6;

        for(int i=0;i<values.length;i++){
            root = insert(root , values[i]);
        }

        inOrder(root);
        System.out.println();

        System.out.println(search(root , key));
    }
}