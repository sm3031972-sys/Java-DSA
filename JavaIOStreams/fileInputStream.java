import java.io.*;
public class fileInputStream {
    public static void main(String args[]) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/Admin/Desktop/java practice/JavaIOStreams/Test.txt");
        
        //  METHOD -1
        byte b[] = new byte[fis.available()];
        fis.read(b);

        String str = new String(b);

        System.out.println(str);

        // METHOD - 2

        // int x;
        // do{
        //     x = fis.read();
        //     if(x!=-1)
        //       System.out.print((char)x);
        // }while(x != -1);
    

        fis.close();
    }
}
