package zi04File;

import java.io.File;

public class demo02 {
    public static void main(String[] args) {
        File f1=new File("E:\\java-base\\untitled2\\src\\zi04File");
        System.out.println(f1);
        File f2=new File("E:\\java-base\\untitled2\\src\\zi04File\\demo02.txt" );
        System.out.println(f2);
        File file = new File("E:\\java-base\\untitled2\\src", "E:\\java-base\\untitled2\\src\\zi");
        System.out.println(file);
    }

}
