package day01base;
// 当这个源文件中有一个public修饰的类时，源文件的名称必须和public修饰的类的类名完全一致(区分大小写)
public class base02 {
    public static void main(String[] args) {
        /*System.out.println("out");
        System.out.println(methon1(3,4));
        int[] arraya={1,2,3};
        System.out.println(arraya);//[I@50cbc42f内存地址
        System.out.println(arraya[0]);
        int i=0;
        for(i=0;i<arraya.length;i++)
        {
            System.out.println(arraya[i]);
        }*/

        //数组的赋值
        int[] ayyaya=new int[3];
        System.out.println(ayyaya);
        System.out.println(ayyaya[0]);
        System.out.println(ayyaya[1]);
        System.out.println(ayyaya[2]);
        ayyaya[1]=10;
        ayyaya[2]=20;
        System.out.println(ayyaya);
        System.out.println(ayyaya[0]);
        System.out.println(ayyaya[1]);
        System.out.println(ayyaya[2]);

        int[] ayyayb=ayyaya;
        System.out.println(ayyayb);
        System.out.println(ayyayb[0]);
        System.out.println(ayyayb[1]);
        System.out.println(ayyayb[2]);
        ayyayb[1]=100;
        ayyayb[2]=200;
        System.out.println(ayyayb);
        System.out.println(ayyayb[0]);
        System.out.println(ayyayb[1]);
        System.out.println(ayyayb[2]);
        System.out.println(ayyaya);
        System.out.println(ayyaya[0]);
        System.out.println(ayyaya[1]);
        System.out.println(ayyaya[2]);

        //数组一旦定义，就不可改变
        /*int[] ayyaya=new int[3];
        System.out.println(ayyaya.length);
        System.out.println(ayyaya);
        ayyaya=new int[5];
        System.out.println(ayyaya.length);
        System.out.println(ayyaya);*/
    }

    public static int methon1(int a,int b)
    {
        return a+b;
    }

}

