package zi03Lambda;

public class demo03 {
    public static void main(String[] args) {
        methon(10, 20, new demo03calc() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        //匿名内部类
        methon(100,120,(int a,int b)->{return a+b;});
        methon(100,120,(int a,int b)-> a+b);
    }
    public static void methon(int a,int b,demo03calc calc){
        int sum=a+b;
        System.out.println(sum);
    }
}
