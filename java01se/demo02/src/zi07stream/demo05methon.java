package zi07stream;

public class demo05methon {
    public static void println(demo05print s)
    {
        s.println("hemmo");
    };

    public static void main(String[] args) {
       /* println((s)->{
            zi07stream.demo05toupper obj=new zi07stream.demo05toupper();
            obj.toCase(s);
        });*/
        demo05toupper obj=new demo05toupper();
        println(obj::toCase);
    }
}
