import java.util.*;
class FindDistincrElements{
    public static void main(String args[]){
        int arr[] ={ 1, 4,4 ,7 ,8, 2, 1, 9, 8, 7, 9};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}