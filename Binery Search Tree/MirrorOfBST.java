import java.util.*;
class MirrorOfBST{
    public static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            // this.left=left;
            // this.right=right;
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

    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }

        Node leftmirror = createMirror(root.left);
        Node rightmirror = createMirror(root.right);

        root.left = rightmirror;
        root.right = leftmirror;

        return root;
    }

    public static void main(String args[]){
        
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        inOrder(root);
        System.out.println();

        root = createMirror(root);
        inOrder(root);
    }
}