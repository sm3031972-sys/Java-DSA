import java.io.*;
class Student{
    int rollno;
    String name;
    String dept;
}
public class PrintStreamIntoFile {
   public static void main(String[] args) throws Exception{
    // TO WRITE THE DATA INTO THE FILE .....
    // FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\java practice\\JavaIOStreams\\data.txt");
    // PrintStream ps = new PrintStream(fos);

    // Student s = new Student();
    // s.rollno = 3163;
    // s.name = "Suraj";
    // s.dept = "CSE";

    // ps.println(s.rollno);
    // ps.println(s.name);
    // ps.println(s.dept);

    // ps.close();
    // fos.close();

    // TO READ THE DATA FROM FILE 
    FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\java practice\\JavaIOStreams\\data.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fis));

    Student s = new Student();
    s.rollno = Integer.parseInt(br.readLine());
    s.name = br.readLine();
    s.dept = br.readLine();

    System.out.println("Roll No = "+s.rollno);
    System.out.println("Name = "+s.name);
    System.out.println("Department = "+s.dept);

    
   } 
}
