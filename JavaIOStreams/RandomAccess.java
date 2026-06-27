import java.io.*;
class RandomAccess{
    public static void main(String[] args) throws Exception{
        RandomAccessFile rf = new RandomAccessFile("C:\\Users\\Admin\\Desktop\\java practice\\JavaIOStreams\\data.txt","rw");

        System.out.println((char)rf.read());    
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('e');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());
        rf.seek(3);
        System.out.println((char)rf.read());
        rf.skipBytes(4);
        System.out.println(rf.getFilePointer());




    }
}