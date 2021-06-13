package demo02pack;

import java.util.ArrayList;

/*自动拆箱和装箱*/
public class demo02 {
    public static void main(String[] args) {
        Integer i=5;//自动装箱 相当于Integer i=Integer.valueOf(5);
        i=i+8;//等号右边 将i对象转成基本数值 （自动拆箱） i.intValue()+5;
        //加法运算完成后 再次装箱 把基本数值转成对象
        System.out.println(i);

        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);//集合无法直接存储整数 可以存储Integer包装类  自动装箱a.add(new Integer(1))
        int a1=a.get(0);//自动拆箱a.get(0).intValue();
        System.out.println(a1);
    }
}
