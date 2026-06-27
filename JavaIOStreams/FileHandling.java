import java.io.*;
public class FileHandling {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\Admin\\Desktop\\java practice\\JavaIOStreams");
        System.out.println(f.isDirectory());

        // To List All Files in the given file
        // String list[] = f.list();
        // for(String x:list){
        //     System.out.println(x);
        // }

        // To get the filename with their path;
        File list[] = f.listFiles();
        for(File x:list){
            System.out.print(x.getName()+"  ");
            System.out.println(x.getPath());
        }
    }  
}
