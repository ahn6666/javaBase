package zi07stream;

public class demo09main {
    public static void print(String name, demo09inter pb)
    {
        demo09 obj=pb.mai(name);
        System.out.println(obj.getName());
    }

    public static void main(String[] args) {
//        print("地理热吧",(String name)->{return new zi07stream.demo09(name);});
        print("迪丽热巴", demo09::new);
    }
}
