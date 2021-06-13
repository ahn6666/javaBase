package day14Inside;

public class inside10anonymous {
    public static void main(String[] args) {
        inside09an obj=new inside09an();
        obj.menthon();

        inside08anonymous anonymous=new inside08anonymous() {
            @Override
            public void menthon() {
                System.out.println("这是实现匿名");
            }
        };
        anonymous.menthon();
    }

}
