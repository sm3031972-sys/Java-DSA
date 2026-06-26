import java.util.*;
class DeleteNodeInBST{
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
    // Searching ...

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
    // deleting a NOde in BSt....
    public static Node delete(Node root , int val){
        if(root.data < val){
            root.right = delete(root.right , val);
        }else if(root.data > val){
            root.left = delete(root.left , val);
        }else{
            
            // case 1 : leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2:single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // case 3: both children

            Node IS = findInoderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root;
    }
    public static Node findInoderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
            
        }
        return root;
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

        root = delete(root ,6);
        System.out.println(); 
         
        inOrder(root);

    }
}