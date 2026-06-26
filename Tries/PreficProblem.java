

// INCOMPLETE PREOBLEM....TRY TO SOLVE IT  

class PreficProblem{
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node(){
            for(int i=0;i<children.length;i++){
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children.freq++;
            }
            curr = curr.children[idx];
        }
    }


    // this below commentted function is incomplete or wrong  we have to complete this....

    // public static void search(String key){
    //     Node curr = root;
    //     for(int level=0; level<key.length(); level++){
    //         int idx = key.charAt(level) - 'a';
    //         if(curr.children[idx].freq >= 1){
    //             System.out.print(curr.children[idx]);
    //         }
    //         curr = curr.children[idx];
    //     }
    //     curr.eow == true;
    // }


    public static void main(String args[]){
        String arr[] = {"zebra" , "dog" , "duck" , "dove"};

        for(int i=0;i<arr.length();i++){
            insert(arr[i]);
        }
    }
}