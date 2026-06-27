// Question No-23 on leetcode


class Solution5{
    public Node merge(Node l1,Node l2){

        if(l1==null) return l2;
        if(l2==null) return l1;
        
        if(l1.data<=l2.data){
            Node res=l1;
            l1.next=merge(l1.next,l2);
            return l1;
        }
        else{
            Node res=l2;
            l2.next=merge(l1,l2.next);
            return l2;
        }
    }

    public Node mergeKlist(Node[] lists){
        Node res=null;

        for(Node list:lists){
            res=merge(res,lists);
        }
        return res;
    }
}