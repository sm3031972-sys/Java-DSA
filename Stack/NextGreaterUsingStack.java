import java.util.*;
class NextGreaterUsingStack{
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        int arr[]={3,2,0,5,6};
        int nxtGreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

          while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
           }
         if(s.isEmpty()){
            nxtGreater[i]=-1;
        }else{
            nxtGreater[i]=arr[s.peek()];
        }
        s.push(i);
        }
        
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}