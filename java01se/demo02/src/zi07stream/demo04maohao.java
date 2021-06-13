package zi07stream;

public class demo04maohao {


    public static  void println(demo04inte s) {
        s.println("helloworld");
    }

    public static void main(String[] args) {
        println(s -> System.out.println(s));
        println(System.out::println);//方法引用
    }

}
