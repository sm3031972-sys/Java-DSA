// 71 LeetCode Question
import java.util.*;
class stackSolution2{
    public static String simlifyPath(String path){
        String[] paths=path.split("/");
        Stack<String> s=new Stack<>();

        for(int idx=0;idx<paths.length;idx++){

            if(paths[idx].equals(".")){
                continue;
            }
            else if(paths[idx].equals("")){
                continue;
            }
            else if(paths[idx].equals("..")){
                if(s.size()>0) 
                   {s.pop();}
            }
            else{
                s.push(paths[idx]);
            }
        }
        String res="";
        while(s.size()>0){
            String folder=s.pop();
            res="/" +f
            
            older +res;
        }
        if(res.length()==0) return "/";
        return res;
    }
    public static void main(String args[]){
        String path="c/./Document/songs/../songs/tauba.mp3";
        System.out.println(simlifyPath(path));
    }
}