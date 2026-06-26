import java.util.*;
class BuildingBinerySearchTree{
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
    public static void main(String args[]){
        int values[] = {5,2,1,4,8,6};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root , values[i]);
        }

        inOrder(root);
    }
}