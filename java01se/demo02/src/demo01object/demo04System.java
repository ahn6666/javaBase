package demo01object;

import java.util.Arrays;

/*public static long currentTimeMills(),返回以毫秒为单位的当前时间。
Public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length):
将数组中指定的数据拷贝到另一个数组中。
*/
public class demo04System {
    public static void main(String[] args) {
       /*long res=demo01();
        System.out.println(res);*/
        demo02();

    }
    public static long demo01()
    {
        long s=System.currentTimeMillis();
        System.out.println(s);
        for (int i = 0; i < 999; i++) {
            System.out.println(i);
        }
        long s1=System.currentTimeMillis();
        System.out.println(s1);
        return s1-s;
    }

    public static void demo02()
    {
        int[] s1= {0,1,2,3,4};
        int[]  s2={5,6,7,8,9};
        System.arraycopy(s1,0,s2,0,3);
        System.out.println(Arrays.toString(s2));
    }


}
