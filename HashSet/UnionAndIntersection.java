import java.util.*;
class UnionAndIntersection{
    public static void main(String args[]){
        int arr1[] = { 1,7,9};
        int arr2[] = {1 , 2 ,4 ,5 ,7 ,8 ,1};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.println(set.size());
        for(Integer s:set){
            System.out.print(s+ " , ");
        }
        System.out.println();
        set.clear();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                
                set.remove(arr2[i]);
            }
        }

        System.out.println(count);

        



    }
}