package demo09thread;

class ClassDemo {

    public static int sum=1;

     ClassDemo() {
        sum = sum + 5;
    }

}

public class one{

    public static void main(String args[]) {

        ClassDemo demo1=new ClassDemo();

        ClassDemo demo2=new ClassDemo();

        System.out.println(demo1.sum);
        System.out.println(demo2.sum);

    }

}
