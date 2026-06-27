import java.io.*;

public class fileOutputStream {
    public static void main(String args[]){
        try{
          FileOutputStream fos = new FileOutputStream("C:/Users/Admin/Desktop/java practice/JavaIOStreams/Test.txt");

          String str = "Learn Java Programming !!";
            byte b[] = str.getBytes();
            fos.write(b); //Read all array of bytes
        //   fos.write(b,6,str.length()-6);   
        // To read from any particular position or to any defined length
          fos.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
