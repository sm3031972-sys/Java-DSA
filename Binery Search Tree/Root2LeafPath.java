import java.util.*;
class Root2LeafPath{
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

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i < path.size();i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println(" null ");
    }

    public static void printRoot2LeafPath(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2LeafPath(root.left , path);
        printRoot2LeafPath(root.right , path);
        path.remove(path.size()-1);
    }
    public static void main(String args[]){
        int values[] = {5,2,1,4,8,6,7,3,10,9};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root , values[i]);
        }

        inOrder(root);
        System.out.println();

        printRoot2LeafPath(root , new ArrayList<>());
        
    }
} 