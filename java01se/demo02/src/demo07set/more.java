package demo07set;

public class more {
    public static void main(String[] args) {
        int a=methon(1,2,3,4);
        System.out.println(a);
        methon2("A",1,3,4);
        methon3(1);

    }
    //：一个方法的参数列表，只能有一个可变参数
    public static  int methon(int ...a)
    {
        int sum=0;
        for (int i : a) {
            sum+=i;

        }
        return sum;
    }//：如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
    public static void methon2(String c,int ...a)
    {
        int sum=0;
        for (int i : a) {
            sum+=i;

        }
        System.out.println("字符串"+c +sum);
    }
    //终极写法
    public static void methon3(Object ...a)
    {
        System.out.println(2);
    }

}
