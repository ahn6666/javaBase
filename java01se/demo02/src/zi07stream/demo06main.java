package zi07stream;

public class demo06main {
    public static void print(int num,demo06static s)
    {
        System.out.println(s.cal(num));
    }

    public static void main(String[] args) {
        print(-10,s->Math.abs(s));
        print(-10,Math::abs);
    }
}
